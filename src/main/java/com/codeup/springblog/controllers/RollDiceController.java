package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

@Controller
public class RollDiceController {
    @GetMapping("/roll-dice")
    public String rollDice() {
        return "roll-dice";
    }

    @GetMapping("/roll-dice/{n}")
    public String guessedRoll(
            @PathVariable int n, Model model) {
        Random r = new Random();
        int low = 1;
        int high = 6;
        int randomNumber = r.nextInt(high-low) + low;
        model.addAttribute("diceRoll",randomNumber);
        model.addAttribute("userGuess",n);
        model.addAttribute("isCorrect", randomNumber == n);

        return "roll-dice";

    }
}
