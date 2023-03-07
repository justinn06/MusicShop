import java.util.Arrays;

public class MusicShop {
    private String name;
    private String address;
    private String website;
    private String tel;
    Manager manager;
    OfficeStaff[] officeStaffs;

    public MusicShop(String name, String address, String website, String tel) {
        this.name = name;
        this.address = address;
        this.website = website;
        this.tel = tel;
        officeStaffs = new OfficeStaff[3];
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MusicShop{" +
                "Name = '" + name + '\'' +
                ", Address = '" + address + '\'' +
                ", Website = '" + website + '\'' +
                ", Tel = '" + tel + '\'' +
                ", \nManager = " + manager +
                ", \nOffice Staff = " + Arrays.toString(officeStaffs) +
                '}';
    }

    public static void main(String[] args) {
        MusicShop musicShop1 = new MusicShop("Justin's Records", "Via Roma", "www.justinsrecords.com", "123");

        Manager manager1 = new Manager("Eugi", 16, 01, true);
        //System.out.println(manager1.toString());

        OfficeStaff officeStaff1 = new OfficeStaff("Adi", 16, 02);
        //System.out.println(officeStaff1.toString());
        OfficeStaff officeStaff2 = new OfficeStaff("Gabri", 16, 03);
        //System.out.println(officeStaff2.toString());
        OfficeStaff officeStaff3 = new OfficeStaff("Mykyta", 16, 04);
        //System.out.println(officeStaff2.toString());

        musicShop1.manager = manager1;
        musicShop1.officeStaffs[0] = officeStaff1;
        musicShop1.officeStaffs[1] = officeStaff2;
        musicShop1.officeStaffs[2] = officeStaff3;

        System.out.println(musicShop1.toString());

        System.out.println("Eugi's wage: " + manager1.calcWage(40));
        System.out.println("Adi's wage: " + officeStaff1.calcWage(40));

    }
}
