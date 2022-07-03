package com.hornik.rabbit.controller;


import com.hornik.rabbit.dao.RabbitDAO;
import com.hornik.rabbit.entity.Clapier;
import com.hornik.rabbit.entity.Rabbit;
import com.hornik.rabbit.service.ClapierService;
import com.hornik.rabbit.service.RabbitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class General {


	@Autowired
	private RabbitService rabbitService;
	@Autowired
	private ClapierService clapierService;

	@GetMapping("/home")
	public String showHome() {
		System.out.println("WE ARE in GET /home ");
		return "arabbit";

	}

	@GetMapping("/mylist")
	public String showRabbits(Model model){

		System.out.println("WE ARE in /mylist !!!! ");

		List<Rabbit> theList = rabbitService.findAll();
		model.addAttribute(theList);

		return "arabbit";
	}


	@GetMapping("/tototiti")
	public String showTOTO(){
		System.out.println("in /tototiti");
		return "arabbit";
	}

	@GetMapping("/listAlls")
	public String getAllRabbits(Model model){
		System.out.println("WE ARE in /listALLs !!!! ");

		List<Rabbit> theList = rabbitService.findAll();
		model.addAttribute(theList);
		return "listAllRabbits";
	}

	@GetMapping("/register")
	public String showForm(Model model) {
		System.out.println("WE ARE in /register ");

		Rabbit rabbit = rabbitService.findById(2);
		System.out.println("my rabbit = "+rabbit);
		model.addAttribute("rabbit", rabbit);

		return "MyRabbit";
	}
	@GetMapping("/tousLes")
	public String showForms(Model model) {
		System.out.println("WE ARE in /tousLes  ");

		 List<Rabbit> rabbits = rabbitService.findAll();
		System.out.println("my rabbits = "+rabbits);
		model.addAttribute("rabbits", rabbits);

		return "AllRabbits";
	}
	@GetMapping("/UnLapin")
	public String showEmployee() {
		System.out.println("get /UnLapin");
		Rabbit rabbit = rabbitService.findById(2);
		System.out.println("my rabbit = "+rabbit);

		return "listRabbits";
	}


	@GetMapping("/TousLapin")
	public String showAllLapins() {
		System.out.println("get /tous Clapiers !!!!!! lapins");

		List<Clapier> theList = clapierService.findAll();
		System.out.println("my clapiers = "+theList);

		return "listRabbits";
	}
	@GetMapping("Allowed")
	public String showAllowed() {
		return "OnePage";
	}
	@GetMapping("/Leaders")
	public String showManager() {
		return "workLeaders";
	}

	@GetMapping("/Admins")
	public String showAdmin() {
		return "workAdmins";
	}
	@GetMapping("/access-denied")
	public String accessDenied() {
		return "accessDeny.html";
	}

	@GetMapping("error")
	public String errorPage(){
		return "errorPage.html";
	}
	@PostMapping("/postMap")
	void postMapp(){

	}
	public String getTOTO(){
		return "toto.html";
	}
}
