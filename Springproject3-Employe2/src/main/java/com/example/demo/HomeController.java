package com.example.demo;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.dao.EmpRepository;
import com.example.model.Emp;

@Controller
public class HomeController {

	private EmpRepository empRepository;
	public HomeController(EmpRepository empRepository) {
		this.empRepository=empRepository;
		System.out.println("Home Controller Invoked");
	}
	
	@RequestMapping("/")
	public String addEmp() {
		return "Registration";
	}
	@PostMapping(path="/saveEmp" ,consumes = {"application/json"})
	//@RequestMapping("/saveEmp")
	public String saveEmp(@RequestBody Emp e) {
		empRepository.save(e);
		return "Registration";
	}
	
	@GetMapping(path="/ViewAllEmp", produces ={"application/json"})
	//@RequestMapping("/ViewAllEmp")
	@ResponseBody
	public  Iterable<Emp> allProducts() {
		return empRepository.findAll();
		
	}
	
	@GetMapping(path="/emp/{empid}",produces ={"application/json"})
	@ResponseBody
	public  Optional<Emp> oneProducts(@PathVariable("empid") int eid) {
		return empRepository.findById(eid);
		
	}
	
	@GetMapping(path="/editEmp/{eid}",produces={"application/json"})
	public String editEmp (@PathVariable("eid") int eid ,Model model) {
		
		model.addAttribute("emp", empRepository.findById(eid));
		return "EmpEdit";
		
		}
	@PutMapping(path="/updateEmp",consumes = {"application/json"})
	//@RequestMapping("/editEmp/updateEmp")
	public  String updateEmp(@RequestBody Emp emp) {
		empRepository.save(emp);
		return "redirect:/ViewAllEmp";
		
    }
	
	@DeleteMapping(path="/deleteEmp/{eid}",consumes = {"application/json"})
	//@RequestMapping("/deleteEmp/{eid}")

	public String deleteEmp(@PathVariable("eid") int eid) {
		empRepository.deleteById(eid);
		return "redirect:/ViewAllEmp";
	}
	
}/*
package com.example.demo;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.example.dao.EmpService;
import com.example.model.Emp;

@Controller
public class HomeController {

    private final EmpService empService;

    public HomeController(EmpService empService) {
        this.empService = empService;
        System.out.println("Home Controller Invoked");
    }

    @RequestMapping("/")
    public String addEmp() {
        return "Registration";
    }

    @RequestMapping("/saveEmp")
    public String saveEmp(@ModelAttribute("emp") Emp e) {
        empService.saveemp(e);
        return "Registration";
    }

    @RequestMapping("/ViewAllEmp")
    public ModelAndView allEmployees() {
        List<Emp> emps = empService.viewall();
        return new ModelAndView("ViewAllEmp").addObject("emps", emps);
    }

    @RequestMapping("/editEmp/{eid}")
    public String editEmp(@PathVariable("eid") int eid, Model model) {
        model.addAttribute("emp", empService.findemp(eid));
        return "EmpEdit";
    }

    @RequestMapping("/editEmp/updateEmp")
    public String updateEmp(@ModelAttribute("emp") Emp emp) {
        empService.update(emp);
        return "redirect:/ViewAllEmp";
    }

    @RequestMapping("/deleteEmp/{eid}")
    public String deleteEmp(@PathVariable("eid") int eid) {
        empService.empDelete(eid);
        return "redirect:/ViewAllEmp";
    }
}
*/