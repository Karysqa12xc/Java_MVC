import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class PhoneBook extends Phone{
	ArrayList<String> PhoneList = new ArrayList<>();

	@Override
	void insertPhone(String name, String Phone) {
		if(PhoneList.isEmpty()) {
			PhoneList.add(name + ", " + Phone);
		}else {
			String pb = searchPhone(name);
			if(pb != null) {
				if(!pb.contains(Phone)) {
					PhoneList.set(PhoneList.indexOf(pb), pb + " : " + Phone);
				}
			}else {
				PhoneList.add(name + ", " + Phone);
			}
		}	
	}

	@Override
	void removePhone(String name) {
			String sdt = searchPhone(name);
			if(sdt != null) {
				PhoneList.remove(sdt);	
				System.out.println("Đã xóa người dùng " + name + " kèm số điện thoại ra khỏi danh bạ" );
			}else {
				System.out.println("Không tìm thấy người dùng " + name + " trong danh bạ");
			}
		}
		
	

	@Override
	void updatePhone(String name, String newphone) {
			String pb = searchPhone(name);
			if(pb != null) {
				if(!pb.contains(newphone)) {
					PhoneList.set(PhoneList.indexOf(pb), pb.split(",")[0]+ ", " + newphone);
				}
			}else {
				System.out.println("Không tìm thấy người dùng trong danh bạ để update");
			}
		}
		
	

	@Override
	String searchPhone(String name) {
		for(String sdt : PhoneList) {
			if(sdt.split(", ")[0].equals(name)) {
				return sdt;
			}
		}
		return null;
	}

	@Override
	void Sort() {
			//Sắp xếp tăng dần
			Collections.sort(PhoneList, new Comparator<String>() {
				public int compare(String o1, String o2) {
					//return o1.compareTo(o2) Cách nhanh nhất
					if(o1.compareTo(o2) > 0) {
						return 1;//o1 lớn hơn o2
					}else if(o1.compareTo(o2) == 0) {//compareTo là hàm so sánh chuỗi
						return 0;//o2 lớn hơn o1
					}
					return -1;// o2 nhỏ hơn o1
				}
			});
			System.out.println(PhoneList);
		}
	}		

//1:05:31
	

