package com.cmc.cucumber;


import io.cucumber.java.en.Given;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import javax.sound.midi.SysexMessage;

public class RGHPalindromeStepdefs {

  @Given("^redirect to rgh home page$")
  public void hej(){
    List<String> ls= Arrays.asList("a", "b", "c");
    ls.stream().filter(s->s.length()>0).collect(Collectors.<String>toList()).forEach(System.out::println);
    ;

  }
}
