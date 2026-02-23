# 🎓 Vocational Education Career Guide

A comprehensive web portal to help students explore vocational career paths, training programs, and job opportunities in India. Built with Bootstrap and jQuery for a responsive, interactive experience.

![HTML5](https://img.shields.io/badge/HTML5-E34F26?logo=html5&logoColor=white)
![CSS3](https://img.shields.io/badge/CSS3-1572B6?logo=css3&logoColor=white)
![Bootstrap](https://img.shields.io/badge/Bootstrap-3.x-7952B3?logo=bootstrap&logoColor=white)
![jQuery](https://img.shields.io/badge/jQuery-2.1.4-0769AD?logo=jquery&logoColor=white)

## 🎯 Purpose

This project helps students and job seekers:
- Explore various vocational career options
- Find training institutes and certification programs
- Understand entry requirements and course durations
- Learn about job roles and salary expectations
- Make informed decisions about their career path

## 🛠️ Career Paths Covered

| Category | Careers |
|----------|---------|
| **Healthcare** | Practical Nursing, Pharmacy |
| **Technical** | Plumber, Auto Mechanic, Computer Technician |
| **Creative** | Photography, Fashion Design, Dress Making |
| **Service** | Beauty/Cosmetology, Massage Therapy, Food Service |
| **Industrial** | Chemical Technology, Network Technician |

### Career Pages

| Page | Career | Key Information |
|------|--------|-----------------|
| `plumber.html` | Plumber | Training institutes, job roles, salary (₹1.7L - ₹8.8L) |
| `practicalnursing.html` | Practical Nursing | Healthcare career path |
| `auto.html` | Auto Mechanic | Automotive repair certification |
| `phar.html` | Pharmacy | Pharmaceutical technician training |
| `massag.html` | Massage Therapy | Wellness industry career |
| `chemical.html` | Chemical Technology | Industrial chemical operations |
| `Network.html` | Network Technician | IT infrastructure career |
| `beaty.html` | Beauty/Cosmetology | Salon and spa careers |
| `compu.html` | Computer Technician | IT support and repair |
| `dress.html` | Dress Making | Garment design and tailoring |
| `fashion.html` | Fashion Design | Apparel industry career |
| `foods.html` | Food Service/Culinary | Restaurant and hospitality |
| `photo.html` | Photography | Professional photography |
| `yourfuture.html` | Career Planning | General guidance |

## 📁 Project Structure

```
Vocational-education/
├── README.md                    # This file
├── VOCATIONAL EDUCATION.pptx    # Presentation slides
│
└── TEST_DEMO/TEST_DEMO/web/     # Main website
    ├── index.html               # Homepage with career overview
    ├── yourfuture.html          # Career planning guide
    │
    ├── Career Pages/
    │   ├── plumber.html         # Plumber career info
    │   ├── practicalnursing.html
    │   ├── auto.html
    │   ├── phar.html
    │   ├── massag.html
    │   ├── chemical.html
    │   ├── Network.html
    │   ├── beaty.html
    │   ├── compu.html
    │   ├── dress.html
    │   ├── fashion.html
    │   ├── foods.html
    │   └── photo.html
    │
    ├── css/                     # Stylesheets
    │   ├── bootstrap.css        # Bootstrap framework
    │   ├── style.css            # Main custom styles
    │   ├── font-awesome.min.css # Icon fonts
    │   ├── jquery-ui.css        # UI components
    │   └── easy-responsive-tabs.css
    │
    ├── js/                      # JavaScript
    │   ├── jquery-2.1.4.min.js  # jQuery library
    │   ├── bootstrap.js         # Bootstrap JS
    │   ├── jquery-ui.js         # UI components
    │   ├── jarallax.js          # Parallax effects
    │   ├── SmoothScroll.min.js  # Smooth scrolling
    │   └── easy-responsive-tabs.js
    │
    ├── images/                  # Image assets
    └── fonts/                   # Custom fonts
```

## 🚀 Getting Started

### Option 1: Direct Access
Simply open `TEST_DEMO/TEST_DEMO/web/index.html` in any web browser.

### Option 2: Local Server (Recommended)

**Using Python:**
```bash
cd TEST_DEMO/TEST_DEMO/web
python -m http.server 8000
# Visit: http://localhost:8000
```

**Using Node.js:**
```bash
npx serve TEST_DEMO/TEST_DEMO/web
```

**Using VS Code:**
Install "Live Server" extension, right-click `index.html` → "Open with Live Server"

### Option 3: Deploy to Web Host
Upload contents of `TEST_DEMO/TEST_DEMO/web/` to any static web host:
- GitHub Pages
- Netlify
- Vercel
- Any shared hosting

## 📖 Career Information Format

Each career page includes:

### 1. Course Objective
What you'll learn and what the career involves

### 2. Training Locations
List of institutes offering certification:
- Jaganath Rathi Vocational Training Institute (Pune)
- Learn India Education (MP)
- National Vocational Training Institute for Women (Noida)
- Vocational Training Center (New Delhi)

### 3. Entry Requirements
- Typically: 10th class (Matriculation) or equivalent
- Age requirements where applicable

### 4. Course Duration
- Most courses: 6 months to 2 years
- Full-time and part-time options

### 5. Job Roles
Career progression paths (e.g., Apprentice → Journeyman → Master)

### 6. Salary Estimates
Expected wages in Indian Rupees (₹)

## 🎨 Features

- **Responsive Design** - Works on mobile, tablet, and desktop
- **Parallax Effects** - Modern visual appeal with jarallax.js
- **Smooth Scrolling** - Better navigation experience
- **Animated Text** - Engaging rotating career highlights
- **Tab Navigation** - Organized content sections
- **Image Gallery** - Visual representation of careers

## 📱 Browser Support

| Browser | Version |
|---------|---------|
| Chrome | 40+ |
| Firefox | 35+ |
| Safari | 9+ |
| Edge | 12+ |
| IE | 11 |

## 🔧 Customization

### Add a New Career Page

1. Copy an existing career page (e.g., `plumber.html`)
2. Update the content:
   - Career title
   - Course objectives
   - Training locations
   - Entry requirements
   - Job roles
   - Salary information
3. Link from `index.html`

### Modify Styles

Edit `css/style.css` for custom styling:
```css
/* Example: Change header color */
.header {
    background-color: #your-color;
}
```

## 🤝 Contributing

Contributions welcome! Ideas for improvement:

- [ ] Add more career paths (Electrician, Welder, Carpenter)
- [ ] Update salary data with current market rates
- [ ] Add more training institutes across India
- [ ] Create state-wise institute directory
- [ ] Add Hindi/regional language support
- [ ] Implement search functionality
- [ ] Add testimonials from professionals
- [ ] Create mobile app version

## 📄 License

This project is for educational purposes. Feel free to use and modify for non-commercial use.

## 👤 Author

**Rajmani Shukla**
- GitHub: [@RajmaniShukla](https://github.com/RajmaniShukla)

## 🙏 Acknowledgments

- Bootstrap Team for the CSS framework
- jQuery Foundation for the JavaScript library
- Font Awesome for the icons
- Various vocational training institutes for career information

---

<div align="center">

### 🇮🇳 Skill India, Build India!

*Empowering youth through vocational education*

🔧 💉 📸 🍳 💻

</div>
