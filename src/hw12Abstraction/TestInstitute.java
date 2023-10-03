package hw12Abstraction;

public class TestInstitute {

	public static void main(String[] args) {

		ColumbiaUniversity columbiaUniversity = new ColumbiaUniversity();
		University university = new ColumbiaUniversity();
		MedicalSchool medicalSchool = new MedicalSchool() {

			@Override
			public void lawInfo() {
				// TODO Auto-generated method stub

			}

			@Override
			public void hygiene() {
				// TODO Auto-generated method stub

			}

			@Override
			public void anatomyLab() {
				// TODO Auto-generated method stub

			}
		};

		columbiaUniversity.biology();
		columbiaUniversity.anatomyLab();
		columbiaUniversity.hygiene();
		columbiaUniversity.commonRoom();
		columbiaUniversity.laboratory();
		columbiaUniversity.languageClub();
		columbiaUniversity.emergencyRoom();
		columbiaUniversity.surgeryRoom();
		columbiaUniversity.cafeteria();
		columbiaUniversity.vocationalInfo();
		columbiaUniversity.classSize();
		columbiaUniversity.playGround();
		columbiaUniversity.teacher();
		columbiaUniversity.lawInfo();
		columbiaUniversity.hw9Abstraction();

		university.classSize();
		university.playGround();
		university.teacher();
		university.hw9Abstraction();
		University.library();
		university.commonRoom();
		university.laboratory();
		university.languageClub();
		university.dorm();
		university.emergencyRoom();
		university.surgeryRoom();
		university.cafeteria();
		university.morgue();

		medicalSchool.anatomyLab();
		medicalSchool.biochemistryLab();
		medicalSchool.hygiene();
		medicalSchool.caring();
		medicalSchool.maths();
		medicalSchool.aeronauticalInfo();
		medicalSchool.mechanicalLab();
		medicalSchool.mechanicalLab();
		medicalSchool.computerLab();
		medicalSchool.anthropology();

	}

}
