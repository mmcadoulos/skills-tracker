package org.enterprise.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class SkillsController {

    @GetMapping
    public String welcome() {
        return "<h1>" +
                "Skills Tracker" +
                "</h1>" +
                "<h2>" +
                "Here's a list of some skills to learn!" +
                "</h2>" +
                "<ol>" +
                "<li>JavaScript</li>" +
                "<li>Java</li>" +
                "<li>C++</li>" +
                "</ol>";
    }

    @PostMapping("form")
    public String formPost(@RequestParam String name, @RequestParam String firstLanguage, @RequestParam String secondLanguage, @RequestParam String thirdLanguage){
        return "<h1>" +
                name +
                "</h1>" +
                "<ol>" +
                "<li>" +
                firstLanguage +
                "</li>" +
                "<li>" +
                secondLanguage +
                "</li>" +
                "<li>" +
                thirdLanguage +
                "</li>" +
                "</ol>";
//        // bonus 1
//        return "<h1>" +
//                name +
//                "</h1>" +
//                "<table style='width:50%'>" +
//                "<tr>" +
//                "<th>" +
//                "First Favorite" +
//                "</th>" +
//                "<th>" +
//                "Second Favorite" +
//                "</th>" +
//                "<th>" +
//                "Third Favorite" +
//                "</th>" +
//                "</tr>" +
//                "<tr>" +
//                "<td>" + firstLanguage + "</td>" +
//                "<td>" + secondLanguage + "</td>" +
//                "<td>" + thirdLanguage + "</td>" +
//                "</tr>";
    }

    @GetMapping("form")
    public String form() {
        return "<form action=\"form-results\" method= \"post\">" +
                "<div>" +
                "<label>Name: </label>" +
                "<input type=\"text\" name=\"name\">" +
                "</div>" +
                "<div>" +
                "<label>My favorite language</label>" +
                "<select name=\"firstLanguage\" id=\"language-select\">" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Java'>Java</option>" +
                "<option value='C++'>C++</option>" +
                "</select>" +
                "</div>" +
                "<div>" +
                "<label>My second favorite language</label>" +
                "<select name=\"secondLanguage\" id=\"language-select\">" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Java'>Java</option>" +
                "<option value='C++'>C++</option>" +
                "</select>" +
                "</div>" +
                "<div>" +
                "<label>My third favorite language</label>" +
                "<select name=\"thirdLanguage\" id=\"language-select\">" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Java'>Java</option>" +
                "<option value='C++'>C++</option>" +
                "</select>" +
                "</div>" +
                "<input type='submit' value='Submit!'>" +
                "</form>";
    }

    @PostMapping("/form-results")
public String formResults (@RequestParam String name, @RequestParam String firstLanguage, @RequestParam String secondLanguage, @RequestParam String thirdLanguage){
        return "<h1>" +
                name +
                "</h1>" +
                "<table style='width:50%'>" +
                "<tr>" +
                "<th>" +
                "First Favorite" +
                "</th>" +
                "<th>" +
                "Second Favorite" +
                "</th>" +
                "<th>" +
                "Third Favorite" +
                "</th>" +
                "</tr>" +
                "<tr>" +
                "<td>" + firstLanguage + "</td>" +
                "<td>" + secondLanguage + "</td>" +
                "<td>" + thirdLanguage + "</td>" +
                "</tr>";
    }



}
