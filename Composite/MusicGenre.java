package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class MusicGenre extends MusicComponent {
    ArrayList<MusicComponent> musicComponents = new ArrayList<MusicComponent>();
    String description;

    public MusicGenre(String description) {
        this.description = description;
    }

    @Override
    public void add(MusicComponent musicComponent) {
        musicComponents.add(musicComponent);
    }

    @Override
    public void remove(MusicComponent musicComponent) {
        musicComponents.remove(musicComponent);
    }

    @Override
    public MusicComponent getChild(int i) {
        return musicComponents.get(i);
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void print() {

            System.out.println(description);
            System.out.println("\n");


            Iterator<MusicComponent> iterator = musicComponents.iterator();

            while (iterator.hasNext()) {
                MusicComponent musicComponent = iterator.next();

                musicComponent.print();

            }
            System.out.println("\n");


    }


}
