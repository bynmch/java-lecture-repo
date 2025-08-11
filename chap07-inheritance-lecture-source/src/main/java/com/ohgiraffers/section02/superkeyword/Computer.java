package com.ohgiraffers.section02.superkeyword;

import java.util.Date;

public class Computer extends Product{
    private String cpu;
    private int hdd;
    private int ram;
    private String operatingSystem;

    public Computer() {
        super();
    }

    public Computer(String cpu, int hdd, int ram, String operatingSystem) {
        super();
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operatingSystem = operatingSystem;
    }

    public Computer(String code, String brand, String name, int price, Date manufactureDate, String cpu, int hdd, int ram, String operatingSystem) {
        super(code, brand, name, price, manufactureDate);
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operatingSystem = operatingSystem;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    @Override
    public String toString() {

        /* 설명. 자식 클래스의 필드만 문자열로 바꿔주고 있음 */
//        return "Computer{" +
//                "cpu='" + cpu + '\'' +
//                ", hdd=" + hdd +
//                ", ram=" + ram +
//                ", operatingSystem='" + operatingSystem + '\'' +
//                '}';

        /* 설명. 부모 클래스의 필드값도 확인해 보기 1 */
//        return this.getCode() + ", "+ this.getBrand() + this.getName() + ", " + this.getPrice() + ", " + this.getManufactureDate()
//                + "Computer{" +
//                "cpu='" + cpu + '\'' +
//                ", hdd=" + hdd +
//                ", ram=" + ram +
//                ", operatingSystem='" + operatingSystem + '\'' +
//                '}'; // this.는  자식 객체를 생성했을 때의 부모객체 내에 있는 메소드도 호출할 수 있음.

        /* 설명. 부모 클래스의 필드값도 확인해 보기 2 */
        return super.toString() + "Computer{" +
                "cpu='" + cpu + '\'' +
                ", hdd=" + hdd +
                ", ram=" + ram +
                ", operatingSystem='" + operatingSystem + '\'' +
                '}'; // 자식 객체에도 toString() 메소드가 있으니 'super.' 으로 부모 클래스의 메소드임을 인지시켜야 한다.
    }
}
