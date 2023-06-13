package com.example.clouds;

import org.json.JSONObject;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/v1")
public class CoffeeController {

    @GetMapping(path="/coffee/favourite", produces=MediaType.APPLICATION_JSON_VALUE)
    public Map<String, String> getFavouriteCoffee() {
        HashMap<String, String> map = new HashMap<>();
        map.put("favouriteCoffee", "espresso");
        return map;
    }

    @GetMapping(path="admin/coffee/favourite/leadeboard", produces=MediaType.APPLICATION_JSON_VALUE)
    public Map<String, List<String>> getFavouriteDrink() {
        HashMap<String, List<String>> map = new HashMap<>();
        map.put("favouriteCoffee",  List.of("espresso", "capuccino", "latte"));
        return map;
    }

    @PostMapping(path="/coffee/favourite", consumes = MediaType.APPLICATION_JSON_VALUE)
    public String putFavouriteDrink(@RequestBody JSONObject drinks) {
        return "ok";
    }
}
