import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Main {
	private static Random random = new Random();
	
	public static String generateCode(){
		String kode = "";
		
		
		for (int i = 0; i < 2; i++) {
            kode += (char)(random.nextInt(26) + 'A');
        }

        kode += "-";

        for (int i = 0; i < 4; i++) {
            kode += random.nextInt(10);
        
        }
		return kode;
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		ArrayList<Manager> listmanager = new ArrayList<Manager>();
		ArrayList<Supervisor> listsupervisor = new ArrayList<Supervisor>();
		ArrayList<Admin> listadmin = new ArrayList<Admin>();
		
	
		
		
		int menu;
		do {
			System.out.println("1. Input");
			System.out.println("2. View");
			System.out.println("3. Update");
			System.out.println("4. Delete");
			System.out.println("5. Exit");
			menu = scan.nextInt();
			scan.nextLine();
			
			switch(menu) {
				case 1:
					String kode = generateCode();
					String  nama, gender, jabatan;
					int flag = 0;
					double gaji = 0;
					int   bonus = 0;
					System.out.println("Input jabatan[Manager | Supervisor | Admin]");
					jabatan = scan.nextLine();
					if(jabatan.equals("Manager")) {
						gaji = 8000000;
						flag = 1;
						do {
							System.out.println("Input nama Karyawan[>=3]: ");
							nama = scan.nextLine();
						}while(nama.length() < 5);
						
						do {
							System.out.println("Input jenis kelamin[Laki-Laki | Perempuan]: ");
							gender = scan.nextLine();
						}while(!gender.equals("Laki-Laki")&& !gender.equals("Perempuan"));
							
						
						
						listmanager.add(new Manager(kode, nama, gender, jabatan, gaji));
					}
					if(jabatan.equals("Supervisor")) {
						gaji = 6000000;
						flag = 2;
						do {
							System.out.println("Input nama Karyawan[>=3]: ");
							nama = scan.nextLine();
						}while(nama.length() < 5);
						
						do {
							System.out.println("Input jenis kelamin[Laki-Laki | Perempuan]: ");
							gender = scan.nextLine();
						}while(!gender.equals("Laki-Laki")&& !gender.equals("Perempuan"));
	
						
						listsupervisor.add(new Supervisor(kode, nama, gender, jabatan, gaji));
					}
					if(jabatan.equals("Admin")) {
						gaji = 400000;
						flag = 3;
						
						do {
							System.out.println("Input nama Karyawan[>=3]: ");
							nama = scan.nextLine();
						}while(nama.length() < 5);
						
						do {
							System.out.println("Input jenis kelamin[Laki-Laki | Perempuan]: ");
							gender = scan.nextLine();
						}while(!gender.equals("Laki-Laki")&& !gender.equals("Perempuan"));
	
						
						listadmin.add(new Admin(kode, nama, gender, jabatan, gaji));
					}
				break;	
				
				case 2:
					int index = 1;
					System.out.println("|No  |Kode          |Nama           |Jenis Kelamin |Jabatan        |Gaji Karyawan     |");
					
					for(int i = 0; i < listmanager.size(); i++) {
						  System.out.format("|%-4d|%-14s|%-15s|%-14s|%-15s|%-18d|\n", index, listmanager.get(i).getKode(), listmanager.get(i).getNama(),
						    listmanager.get(i).getJabatan(), listmanager.get(i).getGender(), listmanager.get(i).getGaji());
						  index++;
						}
						for(int i = 0; i < listsupervisor.size(); i++) {
						  System.out.format("|%-4d|%-14s|%-15s|%-14s|%-15s|%-18d|\n", index, listsupervisor.get(i).getKode(), listsupervisor.get(i).getNama(),
						    listsupervisor.get(i).getJabatan(), listsupervisor.get(i).getGender(), listsupervisor.get(i).getGaji());
						  index++;
						}
						for(int i = 0; i < listadmin.size(); i++) {
						  System.out.format("|%-4d|%-14s|%-15s|%-14s|%-15s|%-18d|\n", index, listadmin.get(i).getKode(), listadmin.get(i).getNama(),
						    listadmin.get(i).getJabatan(), listadmin.get(i).getGender(), listadmin.get(i).getGaji());
						  index++;
						}
				break;
				
//				case 3:
//					int update;
//					System.out.println("Input nomor urutan karyawan yang ingin dihapus: ");
//					update = scan.nextInt() - 1;
//					int size = listmanager.size() + listsupervisor.size() + listadmin.size();
//					
//					if(update >= 0 && update < size){
//						if(update < listmanager.size()) {
//							Manager updatemanager = listmanager.get(update);
//							do {
//								System.out.println("Input nama Karyawan[>=3]: ");
//								updatemanager.setNama(scan.nextLine());
//							}while(nama.length() < 5);
//							
//							do {
//								System.out.println("Input jenis kelamin[Laki-Laki | Perempuan]: ");
//								updatemanager.setGender(scan.nextLine());
//							}while(!gender.equals("Laki-Laki")&& !gender.equals("Perempuan"));
//							
//						}else if(update < listmanager.size() + listsupervisor.size()){
//							Supervisor updatesupervisor = listsupervisor.get(update);
//							do {
//								System.out.println("Input nama Karyawan[>=3]: ");
//								updatesupervisor.setNama(scan.nextLine());
//							}while(nama.length() < 5);
//							
//							do {
//								System.out.println("Input jenis kelamin[Laki-Laki | Perempuan]: ");
//								updatesupervisor.setGender(scan.nextLine());
//							}while(!gender.equals("Laki-Laki")&& !gender.equals("Perempuan"));
//						}else {
//							Admin updateadmin = listadmin.get(update);
//							do {
//								System.out.println("Input nama Karyawan[>=3]: ");
//								updateadmin.setNama(scan.nextLine());
//							}while(nama.length() < 5);
//							
//							do {
//								System.out.println("Input jenis kelamin[Laki-Laki | Perempuan]: ");
//								updateadmin.setGender(scan.nextLine());
//							}while(!gender.equals("Laki-Laki")&& !gender.equals("Perempuan"));
//						}	
//					}
//				break;
				
				case 4:
					int remove;
					System.out.println("Input nomor urutan karyawan yang ingin dihapus: ");
					remove = scan.nextInt() - 1;
					int size = listmanager.size() + listsupervisor.size() + listadmin.size();
					
					if(remove >= 0 && remove < size){
						if(remove < listmanager.size()) {
							listmanager.remove(remove);
						}else if(remove < listmanager.size() + listsupervisor.size()){
							remove -= listmanager.size();
							listsupervisor.remove(remove);
						}else {
							remove -= listmanager.size() + listsupervisor.size();
							listadmin.remove(remove);
						}	
					}
					
				break;	
			}
			
		}while(menu !=5);
		
		
	}
}
