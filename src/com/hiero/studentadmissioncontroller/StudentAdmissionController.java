package com.hiero.studentadmissioncontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentAdmissionController {
	
	@RequestMapping(value="/admissionForm.html", method = RequestMethod.GET)
	public ModelAndView getAdmissionForm(){
		
		ModelAndView model = new ModelAndView("AdmissionForm");
		
		return model;
	}
	
	@ModelAttribute
	public void addingCommonObject(Model model1){
		model1.addAttribute("headerMessage", "Hiero College of Engineering, Hungary");
	}
	
	@RequestMapping(value="/submitAdmissionForm.html", method = RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@ModelAttribute("student1") Student student1){	
		
		ModelAndView model = new ModelAndView("AdmissionSuccess");
		
		return model;
	}
	
}
