package Сlasswork.HW1708;

import java.util.ArrayList;
import java.util.List;

public class ClassRoom {

    private List<Pupil> list = new ArrayList<>();

    public ClassRoom() {
        list.add(new ExelentPupil("Текст1", 26));
        list.add(new NormalPupil("Текст2", 26));
        list.add(new BadPupil("Текст3", 26));
        list.add(new ExelentPupil("Текст4", 28));
    }

    public ClassRoom(Pupil pupil1, Pupil pupil2) {
        list.add(pupil1);
        list.add(pupil2);
    }

    public ClassRoom(Pupil pupil1, Pupil pupil2, Pupil pupil3) {
        this(pupil1, pupil2);
        list.add(pupil3);
    }
    public ClassRoom(Pupil pupil1, Pupil pupil2, Pupil pupil3, Pupil pupil4) {
        this(pupil1, pupil2, pupil3);
        list.add(pupil4);
    }
    public void showRead() {
        list.forEach(x -> x.read());
    }
}
