<div align="center">

# 🚀 SauceDemo Selenium Automation Framework

### *A clean, powerful & industry-standard Test Automation Framework*

[![Java](https://img.shields.io/badge/Java-17+-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.oracle.com/java/)
[![Selenium](https://img.shields.io/badge/Selenium-WebDriver-43B02A?style=for-the-badge&logo=selenium&logoColor=white)](https://www.selenium.dev/)
[![TestNG](https://img.shields.io/badge/TestNG-Automation-DC322F?style=for-the-badge&logo=testng&logoColor=white)](https://testng.org/)
[![Maven](https://img.shields.io/badge/Maven-Build_Tool-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)](https://maven.apache.org/)
[![Extent Reports](https://img.shields.io/badge/Extent-Reports-FF6B9D?style=for-the-badge&logo=files&logoColor=white)](https://extentreports.com/)

<img src="https://user-images.githubusercontent.com/74038190/212284100-561aa473-3905-4a80-b561-0d28506553ee.gif" width="700">

---

### 📌 Built with Selenium + TestNG + POM + Extent Reports

*Perfect for interviews, portfolios, and real-world automation learning*

</div>

---

## 📋 Table of Contents

- [✨ Overview](#-overview)
- [🎯 Key Features](#-key-features)
- [📁 Project Architecture](#-project-architecture)
- [🛠️ Tech Stack](#️-tech-stack)
- [⚡ Quick Start](#-quick-start)
- [🧪 Test Coverage](#-test-coverage)
- [📊 Reports & Screenshots](#-reports--screenshots)
- [🔮 Roadmap](#-roadmap)
- [👨‍💻 Author](#-author)
- [⭐ Support](#-support)

---

## ✨ Overview

<div align="center">

```ascii
╔═══════════════════════════════════════════════════════════╗
║  Professional-Grade Test Automation Framework            ║
║  🎯 POM Design Pattern                                   ║
║  📊 Advanced Reporting                                   ║
║  🔄 Modular & Scalable                                   ║
║  ✅ Industry Best Practices                              ║
╚═══════════════════════════════════════════════════════════╝
```

</div>

This repository showcases a **production-ready Selenium Test Automation Framework** built for the **[SauceDemo](https://www.saucedemo.com/)** e-commerce platform.

### 🎯 Perfect For

<table>
<tr>
<td align="center">💼<br/><b>Job Interviews</b></td>
<td align="center">📚<br/><b>Learning Selenium</b></td>
<td align="center">🎓<br/><b>QA Portfolio</b></td>
<td align="center">🏢<br/><b>Enterprise Projects</b></td>
</tr>
</table>

---

## 🎯 Key Features

<div align="center">

| Feature | Description |
|:-------:|:------------|
| 🏗️ **Page Object Model** | Clean separation of test logic, page actions, and web elements |
| 📊 **Extent Reports** | Beautiful HTML reports with step logs, screenshots & system info |
| 📸 **Smart Screenshots** | Automatic capture on test failures with timestamped filenames |
| 🔧 **Reusable Utilities** | Modular utility classes for screenshots and report management |
| ✅ **E2E Test Coverage** | Complete automation of login, cart, checkout workflows |
| 🚀 **WebDriverManager** | Automatic browser driver management - zero manual setup |
| ⚡ **TestNG Integration** | Powerful test execution, grouping, and parallel capabilities |
| 📦 **Maven Build** | Simplified dependency management and build automation |

</div>

---

## 📁 Project Architecture

<div align="center">

```
📦 saucedemo-selenium-testng-framework
┣ 📂 src/main/java
┃ ┣ 📂 pages              # Page Object Classes
┃ ┃ ┣ 📄 LoginPage.java
┃ ┃ ┣ 📄 ProductsPage.java
┃ ┃ ┣ 📄 CartAndCheckoutPage.java
┃ ┗ 📂 utils              # Utility Classes
┃   ┣ 📄 ScreenshotUtil.java
┃   ┗ 📄 ExtentReportManager.java
┣ 📂 src/test/java
┃ ┗ 📂 tests              # Test Classes
┃   ┣ 📄 LoginTest.java
┃   ┣ 📄 ProductTest.java
┃   ┗ 📄 CartAndCheckoutTest.java
┣ 📂 reports              # HTML Reports (Auto-generated)
┣ 📂 screenshots          # Failure Screenshots
┣ 📄 testng.xml           # TestNG Configuration
┗ 📄 pom.xml              # Maven Dependencies
```

</div>

<div align="center">
<img src="https://github.com/Mankodi2003/saucedemo-selenium-testng-framework/blob/main/blob/main/assets/project_folder_structure.jpg" width="600" alt="Project Structure"/>
</div>

---

## 🛠️ Tech Stack

<div align="center">

<table>
<tr>
<td align="center" width="96">
<img src="https://skillicons.dev/icons?i=java" width="48" height="48" alt="Java" />
<br><b>Java 17+</b>
</td>
<td align="center" width="96">
<img src="https://skillicons.dev/icons?i=selenium" width="48" height="48" alt="Selenium" />
<br><b>Selenium</b>
</td>
<td align="center" width="96">
<img src="https://www.svgrepo.com/show/373929/maven.svg" width="48" height="48" alt="Maven" />
<br><b>Maven</b>
</td>
<td align="center" width="96">
<img src="https://avatars.githubusercontent.com/u/12528662?s=200&v=4" width="48" height="48" alt="TestNG" />
<br><b>TestNG</b>
</td>
</tr>
</table>

### 📚 Dependencies

| Tool | Purpose | Version |
|:-----|:--------|:-------:|
| **Selenium WebDriver** | Browser automation & interaction | 4.x |
| **TestNG** | Test execution framework & assertions | 7.x |
| **WebDriverManager** | Automatic driver management | 5.x |
| **Extent Reports** | Advanced HTML reporting | 5.x |
| **Apache Maven** | Build & dependency management | 3.x |

</div>

---

## ⚡ Quick Start

### Prerequisites

<div align="center">

```bash
☕ Java 17 or higher
📦 Apache Maven 3.6+
🌐 Chrome/Firefox browser
```

</div>

### 🚀 Installation & Execution

<details open>
<summary><b>1️⃣ Clone the Repository</b></summary>

```bash
git clone https://github.com/Mankodi2003/saucedemo-selenium-testng-framework.git
cd saucedemo-selenium-testng-framework
```

</details>

<details open>
<summary><b>2️⃣ Install Dependencies</b></summary>

```bash
mvn clean install
```

</details>

<details open>
<summary><b>3️⃣ Run Test Suite</b></summary>

```bash
# Run all tests
mvn test

# Run specific test class
mvn test -Dtest=LoginTest

# Run with custom testng.xml
mvn test -DsuiteXmlFile=testng.xml
```

</details>

<details open>
<summary><b>4️⃣ View Reports</b></summary>

```bash
📊 Extent Report: /reports/TestReport_<timestamp>.html
📸 Screenshots:   /screenshots/
```

</details>

---

## 🧪 Test Coverage

<div align="center">

### 🔐 Login Module

| Test Case | Status |
|:----------|:------:|
| Valid user login | ✅ |
| Invalid credentials | ✅ |
| Locked user validation | ✅ |
| Empty field validation | ✅ |

### 🛒 Shopping Flow

| Test Case | Status |
|:----------|:------:|
| Add products to cart | ✅ |
| Remove products from cart | ✅ |
| Cart badge counter | ✅ |
| Cart persistence | ✅ |

### 📦 Checkout Process

| Test Case | Status |
|:----------|:------:|
| Complete checkout flow | ✅ |
| User information validation | ✅ |
| Order summary verification | ✅ |
| Success message validation | ✅ |

</div>

### 🎯 Test Scenarios Detailed

```
✅ Login Tests
   ├─ Valid user authentication
   ├─ Invalid credential handling
   ├─ Locked user detection
   └─ Empty field validation

✅ Product Tests
   ├─ Add single/multiple products
   ├─ Remove products from cart
   ├─ Product sorting validation
   └─ Product detail navigation

✅ Cart & Checkout Tests
   ├─ Cart item management
   ├─ Checkout information form
   ├─ Payment information
   ├─ Order summary validation
   └─ Order confirmation
```

---

## 📊 Reports & Screenshots

<div align="center">

### 🎨 Extent Report Features

<table>
<tr>
<td align="center">📝<br/><b>Detailed Step Logs</b></td>
<td align="center">🎯<br/><b>Status Badges</b></td>
<td align="center">📸<br/><b>Failure Screenshots</b></td>
<td align="center">💻<br/><b>System Information</b></td>
</tr>
</table>

### ✅ Report Highlights

```
✔ Test execution timeline
✔ Pass/Fail/Skip statistics
✔ Exception logs with stack traces
✔ Environment details (OS, Browser, Java version)
✔ Embedded screenshots for failed tests
✔ Timestamped report generation
✔ Interactive HTML dashboard
```

### 📸 Screenshot Management

- ✅ **Automatic capture** on test failure
- ✅ **Timestamped filenames** for easy tracking
- ✅ **Embedded in reports** for quick analysis
- ✅ **Organized folder structure** for maintenance

</div>

---

## 🔮 Roadmap

<div align="center">

### 🚀 Upcoming Enhancements

```mermaid
graph LR
    A[Current] --> B[Log4j2 Integration]
    B --> C[Retry Analyzer]
    C --> D[Allure Reports]
    D --> E[Parallel Execution]
    E --> F[CI/CD Pipeline]
    F --> G[Docker Support]
```

</div>

<table>
<tr>
<td>

**Phase 1: Logging** 🎯
- [ ] Log4j2 integration
- [ ] Custom log levels
- [ ] Log file rotation

</td>
<td>

**Phase 2: Reliability** 🔄
- [ ] Retry analyzer for flaky tests
- [ ] Test data management
- [ ] Cross-browser testing

</td>
</tr>
<tr>
<td>

**Phase 3: Reporting** 📊
- [ ] Allure report integration
- [ ] Custom report templates
- [ ] Email notifications

</td>
<td>

**Phase 4: CI/CD** ⚙️
- [ ] GitHub Actions pipeline
- [ ] Docker containerization
- [ ] Cloud execution (Selenium Grid)

</td>
</tr>
</table>

---

## 👨‍💻 Author

<div align="center">

<img src="https://user-images.githubusercontent.com/74038190/216122041-518ac897-8d92-4c6b-9b3f-ca01dcaf38ee.png" width="200" />

### **Prasiddh Mankodi**

*Junior Automation Tester | QA Enthusiast*

[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://linkedin.com/in/prasiddh-mankodi)
[![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/Mankodi2003)
[![Email](https://img.shields.io/badge/Email-D14836?style=for-the-badge&logo=gmail&logoColor=white)](mailto:ldit2025@gmail.com)

---

### 💡 Passionate About

`Automation` • `Selenium` • `Java` • `Frameworks` • `Problem Solving` • `Clean Code`

</div>

---

## ⭐ Support

<div align="center">

### If you find this framework helpful, please consider:

[![Star](https://img.shields.io/github/stars/Mankodi2003/saucedemo-selenium-testng-framework?style=social)](https://github.com/Mankodi2003/saucedemo-selenium-testng-framework)
[![Fork](https://img.shields.io/github/forks/Mankodi2003/saucedemo-selenium-testng-framework?style=social)](https://github.com/YOUR-USERNAME/saucedemo-selenium-testng-framework/fork)
[![Watch](https://img.shields.io/github/watchers/Mankodi2003/saucedemo-selenium-testng-framework?style=social)](https://github.com/YOUR-USERNAME/saucedemo-selenium-testng-framework)

### 🌟 Give it a Star | 🍴 Fork it | 📢 Share it

<img src="https://user-images.githubusercontent.com/74038190/212284115-f47cd8ff-2ffb-4b04-b5bf-4d1c14c0247f.gif" width="400">

---

### 📜 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

<p align="center">Made with ❤️ and ☕ by <b>Prasiddh Mankodi</b></p>

<p align="center">
  <img src="https://capsule-render.vercel.app/api?type=waving&color=gradient&height=100&section=footer"/>
</p>

</div>
