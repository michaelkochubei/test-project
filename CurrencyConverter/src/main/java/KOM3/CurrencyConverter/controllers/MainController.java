package KOM3.CurrencyConverter.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    //обработка главной страницы
    @GetMapping("/")
    public String home(Model model) {
        // передаем шаблону home данные под названием title со значением "главная страница"
        model.addAttribute("title", "Главная страница");
        model.addAttribute("name","Конвертер валют");
        //вызов шаблона
        return "home";
    }

}