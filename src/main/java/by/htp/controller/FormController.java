package by.htp.controller;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import by.htp.model.SignUpModel;

@Controller
@RequestMapping("/form")
public class FormController {

	@Value("#{englishLevelsOptions}")
	private Map<String, String> englishLevelsOptions;

	@Value("${signUpForm.jobOptions}")
	private String[] jobOptions;

	@Value("${signUpForm.interestOptions}")
	private String[] interestOptions;

	@Value("${signUpForm.sexOptions}")
	private String[] sexOptions;
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor editor = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, editor);
	}

	@RequestMapping("/sign-up")
	public String signUp(Model model) {
		model.addAttribute("englishLevelsOptions", englishLevelsOptions);
		model.addAttribute("jobOptions", jobOptions);
		model.addAttribute("interestOptions", interestOptions);
		model.addAttribute("sexOptions", sexOptions);
		model.addAttribute("signUpModel", new SignUpModel());
		return "sign-up";
	}

	@RequestMapping(path = "/sign-up-process", method = RequestMethod.POST)
	public String signUpProcess(@Valid @ModelAttribute("signUpModel") SignUpModel signUpModel,
			BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors()) {
			model.addAttribute("englishLevelsOptions", englishLevelsOptions);
			model.addAttribute("jobOptions", jobOptions);
			model.addAttribute("interestOptions", interestOptions);
			model.addAttribute("sexOptions", sexOptions);
			return "sign-up";
		}
		return "main";
	}

}
