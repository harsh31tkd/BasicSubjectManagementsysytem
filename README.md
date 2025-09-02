# 📚 SubjectManagerApp (Android – Java)

A **Subject Management Android Application** built using **Java** and **SQLite**.  
This app helps students manage their semester subjects efficiently with full **CRUD (Create, Read, Update, Delete)** operations and a **dark mode UI**.  

---

## 🚀 Features
- 📖 **View Subjects** – List of current semester subjects displayed in a clean UI.
- ➕ **Add New Subject** – Create subjects with details like:
  - Subject Name  
  - Instructor Name  
  - Instructor Contact  
  - Class Schedule  
- ✏️ **Edit Subjects** – Update subject details anytime.
- ❌ **Delete Subjects** – Remove unwanted subjects.
- 📂 **Persistent Storage** – Data stored locally using **SQLite**.
- 🎨 **Dark Mode Theme** – Classic dark mode design for better usability.
- 🔗 **Click to View Details** – Tap a subject from the list to see full details.

---

## 🛠️ Tech Stack
- **Language:** Java  
- **Database:** SQLite  
- **IDE:** Android Studio  
- **UI:** XML Layouts with Dark Mode theme  

---

## 📂 Project Structure
```
SubjectManagerApp/
│── app/
│ ├── java/com/example/subjectmanagerapp/
│ │ ├── MainActivity.java
│ │ ├── SubjectDatabaseHelper.java
│ │ ├── AddEditSubjectActivity.java
│ │ ├── SubjectDetailActivity.java
│ │ └── adapters/ (for ListView adapter classes)
│ │
│ └── res/
│ ├── layout/ (XML files for activities & list items)
│ ├── values/ (themes, colors, strings)
│ └── drawable/ (app icons, backgrounds)
│
└── build.gradle
```

---

## 📌 Preloaded Sample Data
The app comes with preloaded subject data for demonstration:
- **Artificial Intelligence**
  - Instructor: Prof. Sharma  
  - Contact: 9876543210  
  - Schedule: Mon-Wed-Fri, 10:00 AM – 11:00 AM  

---

## 📸 Screenshots (Optional – Add later)
- Subject List Screen  
- Add/Edit Subject Screen  
- Subject Detail Screen  

---

## ▶️ How to Run
1. Clone this repository:
   ```bash
   git clone https://github.com/harsh31tkd/BasicSubjectManagementsysytem.git
    ```
2. Open in Android Studio.
3. Let Gradle sync automatically.
4. Run the project on an emulator or physical device.

screenshot:
![pic 1](https://github.com/user-attachments/assets/de64a62c-fbb3-441d-89ed-915efdc819cf)
![pic 2](https://github.com/user-attachments/assets/971bd3b1-f13a-41c3-a5fa-9af2a2d1f2f0)
![pic 3](https://github.com/user-attachments/assets/4fa472ac-a2ea-4eeb-8361-a66e6ce2af08)
![pic 4](https://github.com/user-attachments/assets/4272e801-fd58-4354-b991-8b2404a3497c)
![pic 5](https://github.com/user-attachments/assets/50791431-ed37-47a3-bfa4-c6871448a8e8)


## 🤝 Contribution

Feel free to fork this repo and submit pull requests with improvements.
Suggestions and feedback are always welcome!
