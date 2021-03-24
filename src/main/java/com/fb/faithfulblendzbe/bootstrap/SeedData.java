package com.fb.faithfulblendzbe.bootstrap;

import com.fb.faithfulblendzbe.model.Religion;
import com.fb.faithfulblendzbe.service.ReligionService;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SeedData implements ApplicationListener<ContextRefreshedEvent> {
    private ReligionService religionService;

    public SeedData(ReligionService religionService) {
        this.religionService = religionService;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        generateReligions();
    }

    private void generateReligions() {
        Religion r1 = new Religion("Buddhism");
        Religion r2 = new Religion("Christianity");
        Religion r3 = new Religion("Muslim");

        List<Religion> listOfReligions = new ArrayList<>();
        listOfReligions.add(r1);
        listOfReligions.add(r2);
        listOfReligions.add(r3);

        religionService.saveReligionList(listOfReligions);
    }
}
