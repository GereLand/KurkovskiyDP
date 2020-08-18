package Сlasswork.HW1708;

public class Main {
    public static void main(String[] args) {
        //ученики
        ExelentPupil exelentPupil = new ExelentPupil("Текст", 26);
        NormalPupil normalPupil = new NormalPupil("Текст", 26);
        BadPupil badPupil = new BadPupil("Текст", 26);
        ExelentPupil exelentPupil1 = new ExelentPupil("Текст", 26);

        //учебный класс
        ClassRoom classRoom = new ClassRoom(exelentPupil, normalPupil, badPupil, exelentPupil1);
        classRoom.showRead();
    }
}
