package htmltags;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;

public class HTMLTags {
    
    private static CharSequence txt;
    
    public static void main(String[] args) {
        
        ArrayList<String>tags = new ArrayList<String>();
//        Set<String> distinct = new HashSet<>(tags);
        
        String toSearch = "<!DOCTYPE html>\n" +
"<html lang=\"en\">\n" +
"     #region Head \n" +
"    <head>\n" +
"        <title>Asian College of Technology - One of the Best IT Schools in Cebu</title>\n" +
"        Import Google Icon Font\n" +
"        <link href=\"http:fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\n" +
"        Let browser know website is optimized for mobile\n" +
"        <link rel=\"stylesheet\" href=\"../Content/fonts.css\">\n" +
"        <meta name=\"_globalsign-domain-verification\" content=\"u_GjLwiG9WaRFDD6jC47mb-loKE2UDk5RXQWpzMOpn\" />\n" +
"        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/>\n" +
"        <link href=\"/favicon.ico\" rel=\"shortcut icon\" type=\"image/x-icon\" />\n" +
"         Compiled and minified CSS \n" +
"        \n" +
"        <link href=\"/Content/materialize.css\" rel=\"stylesheet\" />  \n" +
"        \n" +
"        \n" +
"        \n" +
"        <link href=\"/Content/styles.css\" rel=\"stylesheet\"/>\n" +
"        <link href=\"/Content/waitMe.css\" rel=\"stylesheet\"/>\n" +
"\n" +
"        \n" +
"        \n" +
"        Import jQuery before materialize.js\n" +
"        <script type=\"text/javascript\" src=\"https:code.jquery.com/jquery-2.1.1.min.js\"></script>\n" +
"         Compiled and minified JavaScript \n" +
"        \n" +
"        <script src=\"/Scripts/materialize.js\"></script>\n" +
"        <script src=\"/Scripts/jquery.validate.js\"></script>\n" +
"        <script src=\"/Scripts/jquery.validate.unobtrusive.js\"></script>\n" +
"\n" +
"        <script src=\"/Content/Js/Common/Dialog.js\"></script>\n" +
"        <script src=\"/Content/js/common.js\"></script>\n" +
"        <script src=\"/Content/js/waitMe.js\"></script>\n" +
"\n" +
"    </head>\n" +
"     #endregion \n" +
"    <body class=\"waitMe_body\">\n" +
"    <body>\n" +
"        <div class=\"waitMe_container progress\" style=\"background:#000\">\n" +
"            <div style=\"background:#fff\"></div>\n" +
"         </div>\n" +
"         Head Background ACTIEF \n" +
"        <div class = \"no-padding collapse navbar-collapse\">\n" +
"			<div class = \"background header-fixed\"></div>\n" +
"		</div>\n" +
"\n" +
"         Menus \n" +
"        <div class =\"navbar-fixed\">\n" +
"            <nav class=\"white\" role=\"navigation\">\n" +
"                <div class=\"nav-wrapper box-shadow\">\n" +
"                    <a href=\"/home\" class=\"brand-logo right\"><img src =\"/Images/act_logo_2018.png\" class=\"logo\"/></a>\n" +
"                    <ul id=\"\" class=\"left hide-on-med-and-down\">\n" +
"                        <li class = \"\"><a href =\"/home\" class =\"menu blue-grey-text text-darken-4\">Home</a></li>\n" +
"                        <li class = \"\">\n" +
"                              <a class='dropdown-button blue-grey-text text-darken-4' href='#' data-activates='aboutAct'>About ACT</a>\n" +
"\n" +
"                              <ul id='aboutAct' class='dropdown-content grey lighten-4'>\n" +
"                                <li><a href=\"/AboutUs/History\">History</a></li>\n" +
"						        <li><a href=\"/AboutUs/VisionAndMission\">Vision and Mission</a></li>\n" +
"						        <li><a href=\"/AboutUs/GoalsAndObjectives\">Goals And Objectives</a></li>\n" +
"						        <li><a href=\"/AboutUs/CoreValues\">Core Values</a></li>\n" +
"                                                        <li><a href=\"/Administration/AdministrativeOfficers\">Administrative Officers</a></li>\n" +
"						        <li><a href=\"/AboutUs/Affiliation\">Affiliation</a></li>\n" +
"						        <li><a href=\"/AboutUs/Facilities\">Facilities</a></li>\n" +
"						        <li><a href=\"/AboutUs/Scholarship\">Scholarship</a></li>	\n" +
"                              </ul>\n" +
"                        </li>\n" +
"                        <li class = \"\">\n" +
"                            <a href =\"#\" class =\"dropdown-button blue-grey-text text-darken-4\" data-activates='academics'>Academics</a>\n" +
"                            <ul id='academics' class='dropdown-content grey lighten-4'>\n" +
"                                <li><a href=\"/Academics/SeniorHighPrograms\">Senior High Programs</a></li>\n" +
"                                <li>\n" +
"                                    <a href =\"#\" class =\"dropdown-button sub blue-grey-text text-darken-4\" data-activates='academics-sub-1'>Undergraduate Programs</a>\n" +
"                                    <ul id='academics-sub-1' class='dropdown-content grey lighten-4'>\n" +
"                                        <li><a href=\"/Academics/CASP\">College of Arts, Sciences and Pedagogy</a></li>\n" +
"							            <li><a href=\"/Academics/CBM\">College of Business Management</a></li>\n" +
"							            <li><a href=\"/Academics/CCS\">College of Computer Studies</a></li>\n" +
"							            <li><a href=\"/Academics/CNAP\">College of Nursing and Allied Programs</a></li>\n" +
"                                    </ul>\n" +
"                                </li>\n" +
"                                <li><a href=\"/Academics/Faculty\">Faculty</a></li>\n" +
"                            </ul>\n" +
"                            \n" +
"                        </li>\n" +
"                        <li class = \"\">\n" +
"                            <a href =\"#\" class =\"dropdown-button blue-grey-text text-darken-4\" data-activates='admission'>Admission</a>\n" +
"                            <ul id='admission' class='dropdown-content grey lighten-4'>\n" +
"                                <li><a href=\"/Admission/EnrollmentProcedure\">Enrollment Procedures</a></li>\n" +
"						        <li><a href=\"/Admission/AdmissionRequirement\">Admission Requirements</a></li>\n" +
"                            </ul>\n" +
"                        </li>\n" +
"                        <li class = \"\">\n" +
"                            <a href =\"#\" class =\"dropdown-button blue-grey-text text-darken-4\" data-activates='admin'>Administration</a>\n" +
"                            <ul id='admin' class='dropdown-content grey lighten-4'>\n" +
"                                <li><a href=\"/Administration/AdministrativeOfficers\">Administrative Officers</a></li>\n" +
"                            </ul>\n" +
"                        </li>\n" +
"                        <li class = \"\">\n" +
"                            <a href =\"#\" class =\"dropdown-button blue-grey-text text-darken-4\" data-activates='sw'>Student Welfare</a>\n" +
"                            <ul id=\"sw\" class=\"dropdown-content grey lighten-4\">\n" +
"                                <li>\n" +
"                                    <a href=\"#\" class=\"dropdown-button sub blue-grey-text text-darken-4\" data-activates=\"ce\">Campus Experience</a>\n" +
"                                    <ul id=\"ce\" class=\"dropdown-content grey lighten-4\">\n" +
"                                        <li><a href=\"/StudentWelfare/Facilities\">Facilities</a></li>\n" +
"								        <li><a href=\"/StudentWelfare/SafetyAndSecurity\">Safety And Security</a></li>\n" +
"								        <li><a href=\"/StudentWelfare/EnvironmentalResponsibility\">Environmental Responsibility</a></li>\n" +
"								        <li><a href=\"/StudentWelfare/VirtualTour\">Virtual Tour</a></li>\n" +
"                                    </ul>\n" +
"                                </li>\n" +
"                                <li>\n" +
"                                    <a href=\"#\" class=\"dropdown-button sub blue-grey-text text-darken-4\" data-activates=\"ss\">Student Services</a>\n" +
"                                    <ul id=\"ss\" class=\"dropdown-content grey lighten-4\">\n" +
"                                        <li><a href=\"/StudentWelfare/Library\">Library</a></li>\n" +
"								        <li><a href=\"/StudentWelfare/StudentHealth\">Student Health</a></li>\n" +
"								        <li><a href=\"/StudentWelfare/StudentCareer\">Career</a></li>\n" +
"                                        <li><a href=\"/StudentWelfare/CoCurricular\">Co-Curricular</a></li>\n" +
"								        <li><a href=\"/StudentWelfare/ExtraCurricular\">Extra Curricular</a></li>\n" +
"                                    </ul>\n" +
"                                </li>\n" +
"                                <li>\n" +
"                                    <a href=\"#\" class=\"dropdown-button sub blue-grey-text text-darken-4\" data-activates=\"sa\">Student Activities</a>\n" +
"                                    <ul id=\"sa\" class=\"dropdown-content grey-lighten-4\">\n" +
"                                        <li><a href=\"/StudentWelfare/ClubsAndOrganization\">Clubs And Organization</a></li>\n" +
"								        <li><a href=\"/StudentWelfare/CommunityInvolvement\">Community Involvement</a></li>\n" +
"                                        <li><a href=\"/StudentWelfare/MediaPublication\">Media Publication</a></li>\n" +
"                                    </ul>\n" +
"                                </li>\n" +
"                            </ul>\n" +
"                        </li>\n" +
"                        <li class = \"\">\n" +
"                            <a href =\"#\" class =\"dropdown-button blue-grey-text text-darken-4\" data-activates=\"res\">Research</a>\n" +
"                            <ul id=\"res\" class=\"dropdown-content grey lighten-4\">\n" +
"                                <li><a href=\"/Research/ResearchPresentationSchedule\">Research Presentation Schedule</a></li>\n" +
"						        <li><a href=\"/Research/ResearchAnnouncements\">Announcements</a></li>\n" +
"                                <li><a href=\"/Research/ResearchActivities\">Activities</a></li>\n" +
"                                <li><a href=\"/Research/ResearchStudies\">Research Studies</a></li>\n" +
"                                <li><a href=\"/Research/Journal\">Journal</a></li>\n" +
"                            </ul>\n" +
"                        </li>\n" +
"                        <li class = \"\">\n" +
"                            <a href =\"#\" class =\"dropdown-button blue-grey-text text-darken-4\" data-activates=\"alumni\">Alumni</a>\n" +
"                            <ul id=\"alumni\" class=\"dropdown-content grey lighten-4\">\n" +
"                                \n" +
"                                <li><a href=\"/Alumni/AlumniInformation\">Graduate Tracer Survey</a></li>\n" +
"						        <li><a href=\"/Alumni/AlumniAnnouncement\">Announcements</a></li>\n" +
"                                <li><a href=\"/Alumni/AlumniActivities\">Activities</a></li>\n" +
"                                <li><a href=\"/Alumni/FeaturedAlumnus\">Featured Alumnus</a></li>\n" +
"                            </ul>\n" +
"                        </li>\n" +
"                        <li class = \"\">\n" +
"                            <a href =\"#\" class =\"dropdown-button blue-grey-text text-darken-4\" data-activates=\"school\">Campus</a>\n" +
"                            <ul id=\"school\" class=\"dropdown-content grey lighten-4\">\n" +
"						        <li><a href=\"/Schools/ISD\">ISD</a></li>\n" +
"                            </ul>\n" +
"                        </li>\n" +
"                        <li class = \"\">\n" +
"                            <a href=\"#\" class=\"dropdown-button blue-grey-text text-darken-4\" data-activates=\"career\">Career</a>\n" +
"                            <ul id=\"career\" class=\"dropdown-content grey-lighten-4\">\n" +
"                                <li><a href=\"/Career/JobOpportunities\">Job Opportunities</a></li>\n" +
"						        <li><a href=\"/Career/UrgentHiring\">Urgent Hiring</a></li>\n" +
"                            </ul>\n" +
"                        </li>\n" +
"                        <li class = \"\"><a href =\"/ContactUs\" class =\"menu blue-grey-text text-darken-4\">Contact Us</a></li>\n" +
"                        <li class = \"\">\n" +
"                            <a href =\"#\" class =\"dropdown-button blue-grey-text text-darken-4\" data-activates=\"web\">Web</a>\n" +
"                            <ul id=\"web\" class=\"dropdown-content grey lighten-4\">\n" +
"                                <li><a target=\"_blank\" href = \"https:sams.act.edu.ph/\">Students Portal</a></li>\n" +
"                                <li><a target=\"_blank\" href = \"https:guardian.act.edu.ph/\">Guardians Portal</a></li>\n" +
"                            </ul>\n" +
"\n" +
"                        </li>\n" +
"                     </ul>\n" +
"\n" +
"                    \n" +
"                   \n" +
"                  <a href=\"#\" data-activates=\"slide-out\" class=\"button-collapse blue-grey-text text-darken-4\"><i class=\"material-icons\">menu</i></a>\n" +
"\n" +
"                </div>\n" +
"                    \n" +
"            </nav>\n" +
"        </div>\n" +
"\n" +
"\n" +
"        Side Nav\n" +
"         <ul id=\"slide-out\" class=\"side-nav\">\n" +
"            <li><div class=\"userView\">\n" +
"                <div class=\"background\">\n" +
"                <img src =\"/Images/act-logo-transparent.png\" class=\"side-logo\"/>\n" +
"                </div>\n" +
"                <a href=\"#!user\"><img class=\"logo\" src=\"/Images/act-logo-transparent.png\"></a>\n" +
"                <a href=\"#!name\"><span class=\"white-text name\" style=\"color: transparent;\">Asian College of Technology International Educational Foundation</span></a>\n" +
"                <a href=\"#!email\"><span class=\"white-text email\" style=\"color: transparent;\">asian_college@yahoo.com</span></a>\n" +
"            </div></li>\n" +
"             \n" +
"            <li>\n" +
"                <ul class=\"collapsible\" data-collapsible=\"accordion\">\n" +
"                        <li class = \"\">\n" +
"                            <div class=\"collapsible-header\"><i class=\"material-icons\">store</i><a href =\"/home\" class =\"menu custom-text-1\">Home</a></div>\n" +
"                        </li>\n" +
"                        <li class = \"\">\n" +
"                            <div class=\"collapsible-header\"><i class=\"material-icons\">search</i>About ACT</div>\n" +
"                            <div class=\"collapsible-body\">\n" +
"                                <div class=\"collapsible-header\"><a href=\"/AboutUs/History\">History</a></div>\n" +
"                                <div class=\"collapsible-header\"><a href=\"/AboutUs/VisionAndMission\">Vision and Mission</a></div>\n" +
"                                <div class=\"collapsible-header\"><a href=\"/AboutUs/GoalsAndObjectives\">Goals And Objectives</a></div>\n" +
"                                <div class=\"collapsible-header\"><a href=\"/AboutUs/CoreValues\">Core Values</a></div>\n" +
"                                <div class=\"collapsible-header\"><a href=\"/Administration/AdministrativeOfficers\">Administrative Officers</a></div>\n" +
"                                <div class=\"collapsible-header\"><a href=\"/AboutUs/Affiliation\">Affiliation</a></div>\n" +
"                                <div class=\"collapsible-header\"><a href=\"/AboutUs/Facilities\">Facilities</a></div>\n" +
"                                <div class=\"collapsible-header\"><a href=\"/AboutUs/Scholarship\">Scholarship</a></div>\n" +
"                            </div>\n" +
"                        </li>\n" +
"                        <li class = \"\">\n" +
"                            <div class=\"collapsible-header\"><i class=\"material-icons\">play_arrow</i>Academics</div>\n" +
"                            <div class=\"collapsible-body\">\n" +
"                                <div class=\"collapsible-header\"><a href=\"/Academics/SeniorHighPrograms\">Senior High Programs</a></div>\n" +
"                                <div class=\"collapsible-header\"><a href=\"/Academics/CASP\">CASP</a></div>\n" +
"                                <div class=\"collapsible-header\"><a href=\"/Academics/CBM\">CBM</a></div>\n" +
"                                <div class=\"collapsible-header\"><a href=\"/Academics/CCS\">CCS</a></div>\n" +
"                                <div class=\"collapsible-header\"><a href=\"/Academics/CNAP\">CNAP</a></div>\n" +
"                                <div class=\"collapsible-header\"><a href=\"/Academics/Faculty\">Faculty</a></div>\n" +
"                            </div>\n" +
"                        </li>\n" +
"                        <li class = \"\">\n" +
"                            <div class=\"collapsible-header\"><i class=\"material-icons\">description</i>Admission</div>\n" +
"                            <div class=\"collapsible-body\">\n" +
"                                <div class=\"collapsible-header\"><a href=\"/Admission/EnrollmentProcedure\">Enrollment Procedures</a></div>\n" +
"                                <div class=\"collapsible-header\"><a href=\"/Admission/AdmissionRequirement\">Admission Requirements</a></div>\n" +
"                            </div>\n" +
"                        </li>\n" +
"                        <li class = \"\">\n" +
"                            <div class=\"collapsible-header\"><i class=\"material-icons\">perm_identity</i>Administration</div>\n" +
"                            <div class=\"collapsible-body\">\n" +
"                                <div class=\"collapsible-header\"><a href=\"/Administration/AdministrativeOfficers\">Administrative Officers</a></div>\n" +
"                            </div>\n" +
"                        </li>\n" +
"                        <li class = \"\">\n" +
"                            <div class=\"collapsible-header\"><i class=\"material-icons\">label</i>Campus Experience</div>\n" +
"                            <div class=\"collapsible-body\">\n" +
"                                <div class=\"collapsible-header\"><a href=\"/StudentWelfare/Facilities\">Facilities</a></div>\n" +
"								<div class=\"collapsible-header\"><a href=\"/StudentWelfare/SafetyAndSecurity\">Safety And Security</a></div>\n" +
"								<div class=\"collapsible-header\"><a href=\"/StudentWelfare/EnvironmentalResponsibility\">Environmental Responsibility</a></div>\n" +
"								<div class=\"collapsible-header\"><a href=\"/StudentWelfare/VirtualTour\">Virtual Tour</a></div>\n" +
"                            </div>\n" +
"                        </li>\n" +
"                        <li class=\"\">\n" +
"                            <div class=\"collapsible-header\"><i class=\"material-icons\">language</i>Student Services</div>\n" +
"                            <div class=\"collapsible-body\">\n" +
"                                <div class=\"collapsible-header\"><a href=\"/StudentWelfare/Library\">Library</a></div>\n" +
"								<div class=\"collapsible-header\"><a href=\"/StudentWelfare/StudentHealth\">Student Health</a></div>\n" +
"								<div class=\"collapsible-header\"><a href=\"/StudentWelfare/StudentCareer\">Career</a></div>\n" +
"                                <div class=\"collapsible-header\"><a href=\"/StudentWelfare/CoCurricular\">Co-Curricular</a></div>\n" +
"								<div class=\"collapsible-header\"><a href=\"/StudentWelfare/ExtraCurricular\">Extra Curricular</a></div>\n" +
"                            </div>\n" +
"                        </li>\n" +
"                        <li class=\"\">\n" +
"                            <div class=\"collapsible-header\"><i class=\"material-icons\">whatshot</i>Student Activities</div>\n" +
"                            <div class=\"collapsible-body\">\n" +
"                                <div class=\"collapsible-header\"><a href=\"/StudentWelfare/ClubsAndOrganization\">Clubs And Organization</a></div>\n" +
"								<div class=\"collapsible-header\"><a href=\"/StudentWelfare/CommunityInvolvement\">Community Involvement</a></div>\n" +
"                                <div class=\"collapsible-header\"><a href=\"/StudentWelfare/MediaPublication\">Media Publication</a></div>\n" +
"                            </div>\n" +
"                        </li>\n" +
"                        <li class = \"\">\n" +
"                            <div class=\"collapsible-header\"><i class=\"material-icons\">pageview</i>Research</div>\n" +
"                            <div class=\"collapsible-body\">\n" +
"                                <div class=\"collapsible-header\"><a href=\"/Research/ResearchPresentationSchedule\">Research Presentation Schedule</a></div>\n" +
"						        <div class=\"collapsible-header\"><a href=\"/Research/ResearchAnnouncements\">Announcements</a></div>\n" +
"                                <div class=\"collapsible-header\"><a href=\"/Research/ResearchActivities\">Activities</a></div>\n" +
"                                <div class=\"collapsible-header\"><a href=\"/Research/Journal\">Journal</a></div>\n" +
"                            </div>\n" +
"                        </li>\n" +
"                        <li class = \"\">\n" +
"                            <div class=\"collapsible-header\"><i class=\"material-icons\">assignment_ind</i>Alumni</div>\n" +
"                            <div class=\"collapsible-body\">\n" +
"                              \n" +
"                                \n" +
"                               <div class=\"collapsible-header\"><a href=\"/Alumni/AlumniInformation\">Graduate Tracer Survey</a></div>\n" +
"                                \n" +
"						        <div class=\"collapsible-header\"><a href=\"/Alumni/AlumniAnnouncement\">Announcements</a></div>\n" +
"                                <div class=\"collapsible-header\"><a href=\"/Alumni/AlumniActivities\">Activities</a></div>\n" +
"                                <div class=\"collapsible-header\"><a href=\"/Alumni/FeaturedAlumnus\">Featured Alumnus</a></div>\n" +
"                            </div>\n" +
"                        </li>\n" +
"                        <li class = \"\">\n" +
"                            <div class=\"collapsible-header\"><i class=\"material-icons\">view_day</i>Campus</div>\n" +
"                            <div class=\"collapsible-body\">\n" +
"						        <div class=\"collapsible-header\"><a href=\"/Schools/ISD\">ISD</a></div>\n" +
"                            </div>\n" +
"                        </li>\n" +
"                        <li class = \"\">\n" +
"                            <div class=\"collapsible-header\"><i class=\"material-icons\">grade</i>Career</div>\n" +
"                            <div class=\"collapsible-body\">\n" +
"                                <div class=\"collapsible-header\"><a href=\"/Career/JobOpportunities\">Job Opportunities</a></div>\n" +
"						        <div class=\"collapsible-header\"><a href=\"/Career/UrgentHiring\">Urgent Hiring</a></div>\n" +
"                            </div>\n" +
"                        </li>\n" +
"                        <li class = \"\">\n" +
"                            <div class=\"collapsible-header\"><i class=\"material-icons\">room</i><a href =\"/ContactUs\" class =\"menu custom-text-1\">Contact Us</a></div>\n" +
"                        </li>\n" +
"                        <li class = \"\">\n" +
"                            <div class=\"collapsible-header\"><i class=\"material-icons\">http</i>Web</div>\n" +
"                            <div class=\"collapsible-body\">\n" +
"                                <div class=\"collapsible-header\"><a target=\"_blank\" href = \"https:sams.act.edu.ph/\">Students Portal</a></div>\n" +
"						        <div class=\"collapsible-header\"><a target=\"_blank\" href = \"https:guardian.act.edu.ph/\">Guardians Portal</a></div>\n" +
"                            </div>\n" +
"                        </li>\n" +
"                     </ul>\n" +
"\n" +
"            </li>\n" +
"        </ul>\n" +
"\n" +
"\n" +
"        <div id=\"index-banner\" class=\"parallax-container\">\n" +
"            <div class=\"section no-pad-bot\">\n" +
"              <div class=\"container\">\n" +
"                <br><br>\n" +
"                <h1 class=\"header center teal-text text-lighten-2\"></h1>\n" +
"                <div class=\"row center\">\n" +
"                  <h5 class=\"header col s12 light\"></h5>\n" +
"                </div>\n" +
"                <div class=\"row center\">\n" +
"                  <a href=\"http:materializecss.com/getting-started.html\" id=\"download-button\" class=\"btn-large waves-effect waves-light teal lighten-1\">Get Started</a>\n" +
"                </div>\n" +
"                <br><br>\n" +
"\n" +
"              </div>\n" +
"            </div>\n" +
"            <div class=\"parallax\">\n" +
"                <img style=\"width: 1000px; height: 620px;\" src=\"/images/ACT HEADER 2018v2.png\" />\n" +
"            </div>\n" +
"            </div>\n" +
"                \n" +
"                \n" +
"\n" +
"\n" +
"\n" +
"\n" +
"<div class=\"row\">\n" +
"    <div class=\"col s12 m9\">\n" +
"        <br /> \n" +
"        <div class=\"carousel carousel-slider collection-top\">\n" +
"            <a class=\"carousel-item\" href=\"\"><img src=\"images/slides/slide20.png\"></a>\n" +
"            <a class=\"carousel-item\" href=\"\"><img src=\"images/slides/slide14.png\"></a>\n" +
"            <a class=\"carousel-item\" href=\"\"><img src=\"images/slides/slide3.jpg\"></a>\n" +
"            <a class=\"carousel-item\" href=\"\"><img src=\"images/slides/slide4.jpg\"></a>\n" +
"\n" +
"     \n" +
"            \n" +
"        </div>\n" +
"    </div>\n" +
"    <div class=\"col s12 m3\">\n" +
"            <br />\n" +
"            <div class=\"right relative\"><h1 class=\"floating-text\">ACT</h1></div>\n" +
"            <ul class=\"collection with-header collection-top box-shadow\">\n" +
"                <li class=\"collection-header\"><h6 class=\"blue-text text-darken-3\">QUICK GUIDES</h6></li>\n" +
"\n" +
"                <li class=\"collection-item\">\n" +
"                    <a href=\"/Admission/EnrollmentProcedure\">Enrollment Procedures</a>\n" +
"                </li>\n" +
"                <li class=\"collection-item grey-text text-darken-3\">\n" +
"                    <a href=\"/Admission/AdmissionRequirement\">Admission Requirements</a>\n" +
"                </li>\n" +
"                \n" +
"                 <li class=\"collection-item\">\n" +
"                    <a href=\"#news3\">TechVoc Enrollment Procedures</a>\n" +
"                </li>\n" +
"                <li class=\"collection-item\">\n" +
"                    <a href=\"#news2\">Announcement from ACT-Library Department</a>\n" +
"                </li>\n" +
"                <li class=\"collection-item\">\n" +
"                    <br />\n" +
"                </li>\n" +
"                <li class=\"collection-item\">\n" +
"                    <a href=\"https:sams.act.edu.ph/\" target=\"_blank\">\n" +
"				    <img class=\"responsive-img\" src=\"../images/webapps/sams.png\">\n" +
"				    </a>\n" +
"\n" +
"                    <br/>\n" +
"                   <span class=\"light-blue-text\">Views: <span id=\"hitCountValue\">2,339,107</span></span>\n" +
"                </li>\n" +
"            </ul>\n" +
"    </div>\n" +
"</div>\n" +
"\n" +
"  <div class=\"parallax-container valign-wrapper\">\n" +
"    <div class=\"parallax\">\n" +
"        <video class=\"responsive-video\" loop=\"loop\" muted=\"muted\" autoplay=\"autoplay\">\n" +
"          \n" +
"            <source src=\"/images/Videos/ACTADVERTISEMENT_2018.mp4\" type=\"video/mp4\" > \n" +
"        </video>\n" +
"    </div>\n" +
"  </div>\n" +
"<div class=\"container\">\n" +
"    <div class=\"card\">\n" +
"        <div class=\"card-stacked\">\n" +
"            <div class=\"card-content\">\n" +
"                <h4>News & Events</h4>\n" +
"                <div class=\"row\" id=\"ce\">\n" +
"                    First Column\n" +
"                    <div class=\"col s12 m4\" id=\"fce\">\n" +
"                        <div class=\"row\">\n" +
"                            \n" +
"                        </div>\n" +
"                    </div>\n" +
"                    Second Column\n" +
"                    <div class=\"col s12 m4\" id=\"sce\">\n" +
"                        <div class=\"row\">\n" +
"                            \n" +
"                        </div>\n" +
"                    </div>\n" +
"                    Third Column\n" +
"                    <div class=\"col s12 m4\" id=\"tce\">\n" +
"                        <div class=\"row\">\n" +
"                            <div class=\"col s12\">\n" +
"                                \n" +
"                            </div>\n" +
"                        </div>\n" +
"                    </div>\n" +
"                </div>\n" +
"                <div class=\"center\"><a id=\"showmore\" class=\"waves-effect waves-light btn grey lighten-3 grey-text text-darken-3 z-depth-1\">SHOW MORE</a></div>\n" +
"            </div>\n" +
"        </div>\n" +
"    </div>\n" +
"\n" +
"</div> \n" +
"\n" +
"\n" +
"      Modal Structure \n" +
"    <div id=\"news2\" class=\"modal\">\n" +
"    <div class=\"modal-content\">\n" +
"        <h4>ANNOUNCEMENT FROM ACT-LIBRARY DEPARTMENT</h4>\n" +
"        <p>Starting from june 2017,  Please secure a library borrower's card.</p>\n" +
"        <ul>\n" +
"            <li><b>NO LIBRARY CARD</b></li>\n" +
"            <li><b>NO BORROWING OF BOOKS</b></li>\n" +
"        </ul>\n" +
"        <ul>\n" +
"            <li><b>REQUIREMENTS:</b></li>\n" +
"            <li>PHOTOCOPY OF CURRENT STUDY LOAD AND ID</li>\n" +
"            <li>1X1 PICTURE</li>\n" +
"        </ul>\n" +
"    </div>\n" +
"    <div class=\"modal-footer\">\n" +
"        <a href=\"#!\" class=\"modal-action modal-close waves-effect waves-green btn-flat\">Close</a>\n" +
"    </div>\n" +
"    </div>\n" +
"\n" +
"     Modal Structure \n" +
"    <div id=\"news3\" class=\"modal\">\n" +
"    <div class=\"modal-content\">\n" +
"        <h4 class=\"grey-text text-darken-1\"><i>TECHVOC COURSES</i></h4>\n" +
"       <p>Techvoc Enrollment Procedures:</p>\n" +
"        <ol>\n" +
"            <li>Approach TechVoc Office at the Upper Ground Floor (UG) for interview, forms and submission of requirements;</li>\n" +
"            <li>Proceed 7th floor for enrollment fee and endorsement of requirements to the registar.</li>\n" +
"        </ol>\n" +
"      \n" +
"        <br />\n" +
"        <h5>TechVoc Courses Offering:</h5>\n" +
"        <ol type=\"A\">\n" +
"                 <li>Caregiving NC </li>\n" +
"                 <li>3D Animation NC III</li>\n" +
"            </ol>\n" +
"            \n" +
"            <li class=\"grey-text text-darken-2\"> Ads: Will accept scholar (e.g Training for Work Scholarship Program (TWSP);\n" +
"                Skills-For-Employment Scholarship Program (SESP) of Overseas Workers Welfare Administration (OWWA); etc.)</li>\n" +
"       \n" +
" \n" +
"    </div>\n" +
"    <div class=\"modal-footer\">\n" +
"        <a href=\"#!\" class=\"modal-action modal-close waves-effect waves-green btn-flat\">Close</a>\n" +
"    </div>\n" +
"    </div>\n" +
"  \n" +
"  \n" +
"     Modal Structure \n" +
"        <div id=\"news1\" class=\"modal\">\n" +
"        <div class=\"modal-content\">\n" +
"            <img class=\"responsive-img\" src=\"images/slides/post1.png\"/>\n" +
"        </div>\n" +
"        <div class=\"modal-footer\">\n" +
"            <a href=\"#!\" class=\"modal-action modal-close waves-effect waves-green btn-flat\">Close</a>\n" +
"        </div>\n" +
"        </div>\n" +
"\n" +
"<script src=\"/Content/js/Home/Index.js\"></script>\n" +
"\n" +
"        \n" +
"  <footer class=\"page-footer white\">\n" +
"    <div class=\"container\">\n" +
"      <div class=\"row\">\n" +
"        <div class=\"col l4 s12\">\n" +
"            <p class = \"text-center\"><img class = \"footer-img\" src=\"../Images/act_logo_2018.png\" alt=\"\" style=\"width: 200px; height: 115px;\"></p>\n" +
"			<i class=\"tiny material-icons\">email</i><a href=\"http:www.facebook.com/pages/Asian-College-of-Technology-OFFICIAL-Fan-Page/364726194062\" target = \"blank\">Follow on  Facebook</a>\n" +
"        </div>\n" +
"        <div class=\"col l5 s12\">\n" +
"            <h4 class = \"footer-header\">Contacts</h4>\n" +
"		    <ul>\n" +
"			    <li><i class=\"tiny material-icons\">picture_in_picture</i> Corner Leon Kilat and P. del Rosario st., Cebu City, Philippines</li>\n" +
"			    <li><i class=\"tiny material-icons\">contact_phone</i> Telephone: +63 (32) 238 2380,  +63 (32) 238 2381</li>\n" +
"			    <li><i class=\"tiny material-icons\">print</i> Fax: +63 (32) 238 2384</li>\n" +
"			    <li><i class=\"tiny material-icons\">email</i> Email: <a href=\"https:mail.google.com/mail/?view=cm&fs=1&to=asian_college@yahoo.com\" target = \"blank\">asian_college@yahoo.com</a></li>\n" +
"		    </ul>\n" +
"            <hr/>\n" +
"             Powered by: <a class=\"brown-text text-lighten-3\" href=\"https:mail.google.com/mail/?view=cm&fs=1&to=actiefsdo@gmail.com\">ACT - Software Development Team</a><br/>\n" +
"            <i class=\"tiny material-icons\">email</i> Email: <a href=\"https:mail.google.com/mail/?view=cm&fs=1&to=actiefsdo@gmail.com\" target = \"blank\">actiefsdo@gmail.com</a>\n" +
"        </div>\n" +
"        <div class=\"col l3 s12\">\n" +
"          <h4>Quick links</h4>\n" +
"		    <ul>\n" +
"			    <li><a href=\"/Admission/EnrollmentProcedure\">Enrollment Procedures</a></li>\n" +
"			    <li><a href=\"/Administration/AdministrativeOfficers\">Administrative Officer</a></li>\n" +
"			    <li><a href=\"/GraduateTracerStudy/Alumni\">Graduated Tracer</a></li>\n" +
"			    <li><a href=\"/Academics/UndergraduatePrograms\">Undergraduate Programs</a></li>\n" +
"			    <li><a href=\"/AboutUs/Scholarship\">Scholarship</a></li>\n" +
"			    <li><a href=\"/StudentWelfare/Facilities\">Facilities</a></li>\n" +
"		    </ul>\n" +
"            <div class=\"left\">\n" +
"                    <span class=\"light-blue-text\" id=\"date\"></span>\n" +
"                    <span class=\"light-blue-text\" id=\"time\"></span>\n" +
"            </div>\n" +
"        </div>\n" +
"      </div>\n" +
"    </div>\n" +
"    <div class=\"footer-copyright\">\n" +
"      <div class=\"container left\">\n" +
"			<p class = \"center\">&copy; Copyright 2012 | Asian College of Technology. All Rights Reserved.</p>\n" +
"      </div>\n" +
"        <div class=\"container right\">\n" +
"            <p class = \"right\">Last update: 08/20/2018</p>\n" +
"        </div>\n" +
"    </div>\n" +
"  </footer>\n" +
"    </body>\n" +
"</html>";
       
        Pattern p = Pattern.compile("<([^\\s>/]+)");
        Matcher m = p.matcher(toSearch);
        while (m.find()) {
            String tag = m.group(1);
            tags.add(tag);
      
        }
        Set<String> distinct = new HashSet<>(tags);
        for (String s: distinct) {
	   System.out.println(s + ": " + Collections.frequency(tags, s));
	}  
      
  }    
}