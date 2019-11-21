package com.ivlai.templates.ssm.test;

import com.ivlai.templates.ssm.entity.ContentMenu;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

    public static void main(String[] args) {

        ArrayList<ContentMenu> objects = new ArrayList<>();
        ContentMenu contentMenu1 = new ContentMenu();
        ContentMenu contentMenu2 = new ContentMenu();
        ContentMenu contentMenu3 = new ContentMenu();
        ContentMenu contentMenu4 = new ContentMenu();
        ContentMenu contentMenu5 = new ContentMenu();
        contentMenu1.setContentMenuTitle("contentMenu1");contentMenu1.setContentMenuType("contentMenu1");
        contentMenu2.setContentMenuTitle("contentMenu2");contentMenu2.setContentMenuType("contentMenu2");
        contentMenu3.setContentMenuTitle("contentMenu3");contentMenu3.setContentMenuType("contentMenu3");
        contentMenu4.setContentMenuTitle("contentMenu4");contentMenu4.setContentMenuType("contentMenu4");
        contentMenu5.setContentMenuTitle("contentMenu5");contentMenu5.setContentMenuType("contentMenu5");

        objects.add(contentMenu1);
        objects.add(contentMenu2);
        objects.add(contentMenu3);
        objects.add(contentMenu4);
        objects.add(contentMenu5);

        objects.forEach(System.out::println);

        Stream<ContentMenu> stream = objects.stream();
        List<String> collect = stream.map(ContentMenu::getContentMenuTitle).collect(Collectors.toList());
        collect.forEach(System.out::println);


    }

}
