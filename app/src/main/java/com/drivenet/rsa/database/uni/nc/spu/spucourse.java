package com.drivenet.rsa.database.uni.nc.spu;


import com.drivenet.rsa.database.DaoClass.VisionDaoInsert;

public class spucourse
{
    public spucourse()
    {
    }
    public void getems(VisionDaoInsert visionDaoInsert)
    {
        visionDaoInsert.insert(new spu(
                25 , "Sol Plaatje University" ,
                "Diploma in Retail Business Management" ,
                "Economic and Management Sciences" ,
                "This qualification forms a base for further specialisation in fields such as buying, merchandising, store lay-out and\n" +
                        "merchandise planning.\n" +
                        "Graduates can choose from a wide variety of entry level positions, e.g. as a trainee manager or a position in buying, stock\n" +
                        "control, merchandising, sales, administration, logistics, housekeeping or the finance section of a retail business." ,
                "NSC pass with Diploma Requirement\n" +
                        "English HL: NSC Level 4 or English 1st additional language: NSC Level 5\n" +
                        "Mathematics: NSC Level 3 or Mathematical Literacy: NSC Level 5\n",
                3 ,
                "Applicants with an APS of 35-38, as well as English 6 and" +
                        " Mathematics 6, will be wait-listed subject to place availability."
        ));
    }

    public void getba(VisionDaoInsert visionDaoInsert)
    {
        visionDaoInsert.insert(new spu(
                30 ,
                "Sol Plaatje University" ,
                "Bachelor of Arts" ,
                "Art and Design" ,
                "B.A. graduates are equipped to become researchers or practitioners in a variety of professional domains such as museums\n" +
                        "and other heritage organisations, language based positions (translation and editing), teaching, communication, journalism,\n" +
                        "creative writing, media work, community development, tourism and the diplomatic service." ,
                "NSC pass with Bachelor Requirement\n" +
                        "English HL: NSC Level 4 or English 1st additional language: NSC Level 5\n" +
                        "Mathematics: NSC Level 3 or Mathematical Literacy: NSC Level 5\n",
                3 ,
                "Applicants with an APS of 35-38, as well as English 6 and" +
                        " Mathematics 6, will be wait-listed subject to place availability."
        ));
    }

    public void getbed(VisionDaoInsert visionDaoInsert)
    {
        visionDaoInsert.insert(new spu(
                30,
                "Sol Plaatje University",
                "Bachelor of Education: Foundation Phase Teaching" ,
                "Education" ,
                "Teaching (Grades R-3)",
                "NSC pass with Bachelor’s Degree requirement"+
                        "English HL Level 4 OR English FAL  Level 5\n" +
                        "Mathematics     " + "Level 4 \n"+
                "If Biology / Life or Physical Sciences is an elective: NSC Level 4",
                4 ,
                "These programmes target potential students who have successfully completed Grade 12 with admission to degree studies\n" +
                        "and who want to teach Languages, Mathematics, Natural Sciences or Languages, Life Skills and Social Sciences to Grade\n" +
                        "4 – 6 learners."
        ));
        visionDaoInsert.insert(new spu(
                30,
                "Sol Plaatje University",
                "Bachelor of Education: Intermediate Phase Teaching" ,
                "Education" ,
                "Teaching (Grade 7 – 9)",
                "NSC pass with Bachelor’s Degree requirement"+
                        "English HL Level 4 OR English FAL  Level 5\n" +
                        "If Mathematics is an elective: NSC Level 4 \n"+
                        "If Biology / Life or Physical Sciences is an elective: NSC Level 4\n" +
                        "If Accounting is an elective: Accounting NSC Level 4",
                4 ,
                "This programme targets potential students who have successfully completed Grade 12 with admission to degree studies\n" +
                        "and who want to teach one or more of the following subjects at school: Mathematics, Natural Sciences, Life Sciences;\n" +
                        "Geography, Technology, Languages, History, Accounting, Economics and Business Management."
        ));
        visionDaoInsert.insert(new spu(
                30,
                "Sol Plaatje University",
                "Bachelor of Education: Senior Phase and Further Education and Training " ,
                "Education" ,
                "Teaching (Grades 10-12)",
                "NSC pass with Bachelor’s Degree requirement"+
                        "English HL Level 4 OR English FAL  Level 5\n" +
                        "If Mathematics is an elective: NSC Level 4 \n"+
                        "If Biology / Life or Physical Sciences is an elective: NSC Level 4\n" +
                        "If Accounting is an elective: Accounting NSC Level 4",
                4 ,
                "This programme targets potential students who have successfully completed Grade 12 with admission to degree studies\n" +
                        "and who want to teach one or more of the following subjects at school: Mathematics, Natural Sciences, Life Sciences;\n" +
                        "Geography, Technology, Languages, History, Accounting, Economics and Business Management."
        ));
    }

    public void getbsc(VisionDaoInsert visionDaoInsert)
    {
        visionDaoInsert.insert(new spu(
                30,
                "Sol Plaatje University",
                "B.Sc. in Biological Sciences" ,
                "Sciences" ,
                "Biologist, " +
                        "Conservation Science, " +
                        "Zoo Curator, " +
                        "Herbarium Curator",
                "NSC pass with Bachelor’s Degree requirement\n" +
                        "English LOLT or HL: NSC Level 4; or English 1st language: NSC Level 5\n" +
                        "Mathematics: NSC Level4 (Mathematical Literacy is not acceptable.)\n" +
                        "PhysicalSciences: NSC Level 4\n" +
                        "LifeSciences: NSC Level 4",
                3 ,
                "The Bachelor of Science degree has been carefully designed to address a critical skills shortage in the country and will\n" +
                        "provide access to students to an advanced area of study in a critical contemporary discipline."
        ));
        visionDaoInsert.insert(new spu(
                30,
                "Sol Plaatje University",
                "B.Sc. in Mathematical and Computer Sciences " ,
                "Sciences" ,
                "Banking, Insurance, Statistician, Computer Programming,\n" +
                        "Operations Research, Cyber Security Analyst, Forensic Computer Analyst and Software Analyst",
                "NSC pass with Bachelor’s Degree requirement\n" +
                        "English LOLT or HL: NSC Level 4; or English 1st language: NSC Level 5\n" +
                        "Mathematics: NSC Level4 (Mathematical Literacy is not acceptable.)\n" +
                        "PhysicalSciences: NSC Level 4\n" +
                        "LifeSciences: NSC Level 4",
                3 ,
                "The Bachelor of Science degree has been carefully designed to address a critical skills shortage in the country and will\n" +
                        "provide access to students to an advanced area of study in a critical contemporary discipline."
        ));
        visionDaoInsert.insert(new spu(
                30,
                "Sol Plaatje University",
                "B.Sc. in Physical Science" ,
                "Sciences" ,
                "Physicist, Chemical Analyst, Quality Control, Forensic GIS Analyst and Geographer",
                "NSC pass with Bachelor’s Degree requirement\n" +
                        "English LOLT or HL: NSC Level 4; or English 1st language: NSC Level 5\n" +
                        "Mathematics: NSC Level 4 (Mathematical Literacy is not acceptable.)\n" +
                        "PhysicalSciences: NSC Level 4\n" +
                        "LifeSciences: NSC Level 4",
                3 ,
                "The Bachelor of Science degree has been carefully designed to address a critical skills shortage in the country and will\n" +
                        "provide access to students to an advanced area of study in a critical contemporary discipline."
        ));
        visionDaoInsert.insert(new spu(
                30,
                "Sol Plaatje University",
                "B.Sc. in Data Science" ,
                "Sciences" ,
                "• DataScientist\t • DataEngineer\n" +
                        "• Data Architect\t • Intelligence Analyst\n" +
                        "• Data Analyst\t • Data MiningEngineer\n" +
                        "• Data/Analytics Manager",
                "NSC pass with Bachelor’s Degree requirement\n" +
                        "English HL: NSC Level 4; or English 1st language: NSC Level 5\n" +
                        "Mathematics: NSC Level 5 (Mathematical Literacy is not acceptable.)\n",
                3 ,
                "Data Science is a field with high demand in various industry sectors. Big companies such as Amazon, Netflix, Facebook,\n" +
                        "Twitter, Microsoft, Uber and all other small companies require skilled data science to drive insightful business decisions."
        ));
    }

    public void gethu(VisionDaoInsert visionDaoInsert)
    {
        visionDaoInsert.insert(new spu(
                25,
                "Sol Plaatje University",
                "Higher Certificate in Heritage Studies" ,
                "Humanities",
                "• Software Analyst • Software ApplicationProgrammer\n" +
                        "• Software Course Developer\t • Web Administrator\n" +
                        "• Solution Arthitecture • Web Designer\n" +
                        "• Computer NetworkProfessional • Web Developer\n" +
                        "• Network Administrator • System Administrator.\n" +
                        "• Network Analyst\n",
                "NSC pass with Certificate requirement" +
                        "English HL: NSC Level 4 OR English 1st additional language: NSC Level 5\n" +
                        "Mathematics: (NSC Level 2) OR Mathematical Literacy: (NSC Level 3)",
                3 ,
                "The skills developed, would encourage work in diverse roles within national and provincial heritage management bodies\n" +
                        "or privately-managed heritage organisations. This could include roles from administration in heritage institutions such as\n" +
                        "museums. Other possible roles could include assisting in archival work in a wide range of institutions including universities,\n" +
                        "public and private bodies, or working within the tourism industry."
        ));
        visionDaoInsert.insert(new spu(
                25,
                "Sol Plaatje University",
                "Higher Certificate in Court Interpreting" ,
                "Humanities",
                "prospectus opportunities include court or legal interpreting, interpreting in community-based environments, meetings,\n" +
                        "conferences, health and medical settings and government agencies",
                "A National Senior Certificate (NSC) (Grade 12) pass with Higher Certificate require mentor National Certificate Vocational (NCV);\n" +
                        "English Home Language: NSC level 4 OR English 1st Additional Language: NSC level 5;\n" +
                        "Students should have at least one other African language to enrol for the Higher Certificate In Court Interpreting, taken as a home language(NCS level 4) OR 1st Additional Language (NCS level 5);\n" +
                        "Mathematics: 30% (NSC Level 2) OR Mathematical Literacy: 40% (NSC Level 3)",
                3 ,
                "The purpose of the Higher Certificate in Court Interpreting is to provide an opportunity for court interpreters who are already\n" +
                        "in the profession as well as newcomers to the field of court interpreting to obtain a recognised formal and professional\n" +
                        "qualification.\n" +
                        "The main aim of the qualification is to professionally equip graduates with the necessary skills to render a specialised service\n" +
                        "in court interpreting to the South African legal system"
        ));
    }

    public void getit(VisionDaoInsert visionDaoInsert)
    {
        visionDaoInsert.insert(new spu(
                30,
                "Sol Plaatje University",
                "Diploma in ICT(Applications Development)" ,
                "Information Technology" ,
                "• Software Analyst • Software ApplicationProgrammer\n" +
                        "• Software Course Developer\t • Web Administrator\n" +
                        "• Solution Arthitecture • Web Designer\n" +
                        "• Computer NetworkProfessional • Web Developer\n" +
                        "• Network Administrator • System Administrator.\n" +
                        "• Network Analyst\n",
                "NSC pass with Bachelor’s Degree requirement\n" +
                        "English HL: NSC Level 4; or English 1st language: NSC Level 5\n" +
                        "Mathematics: NSC level 3 OR Mathematical Literacy: NSC Level 5\n",
                3 ,
                "An exciting prospectus awaits those who successfully complete the Diploma in ICT specialising in Applications Development\n" +
                        "qualification"
        ));
    }
}
