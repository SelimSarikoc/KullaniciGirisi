import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {

        String userName, password,newPassword,select;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adınızı Giriniz: ");
        userName = input.nextLine();

        System.out.print("Parolanızı Giriniz: ");
        password = input.nextLine();

        if (userName.equals("selimsarikoc") && password.equals("123456")) {
            System.out.println("Giriş Başarılı !");
        } else {
            System.out.println("Bilgilerinizi Yanlış, Şifre Değiştirmek İster misiniz ? \nEvet \nHayır");
            System.out.println("Seçiminizi Yapınız: ");
        }
        select = input.nextLine();

        switch (select) {
            case "Evet":
                System.out.println("Yeni Şifre Giriniz: ");
                newPassword = input.nextLine();
                if (newPassword.equals("123456")){
                    System.out.println("Yeni Şifreniz Eski Şifreniz İle aynı Olamaz !");
                }
                else {
                    System.out.println("Şifre Oluşturuldu");
                }
                break;

            case "Hayır":
                System.out.println("Lütfen Tekrar Giriş Yapmayı Deneyiniz");
                break;

            default:
                System.out.println("Hatalı Tuşlama Yaptınız, Lütfen Seçiminizi 'Evet' veya 'Hayır' Şeklinde Belirtiniz! ");
                break;




        }
        }
    }



