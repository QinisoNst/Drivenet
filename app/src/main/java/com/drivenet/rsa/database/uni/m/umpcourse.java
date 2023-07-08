package com.drivenet.rsa.database.uni.m;


import com.drivenet.rsa.database.DaoClass.VisionDaoInsert;

public class umpcourse
{
    public umpcourse()
    {
    }
    public void getems(VisionDaoInsert visionDaoInsert)
    {
        visionDaoInsert.insert(new ump(
                32 ,
                "University of Mpumalanga" ,
                "Bachelor of Commerce" ,
                "Economic and Management Sciences" ,
                "Human resource\n" +
                        "Market researcher\n" +
                        "Financial consultant\n" +
                        "Project or programme manager\n" +
                        "Entrepreneur\n" +
                        "Development manager\n" +
                        "Management consultants\n" +
                        "Economic analysts\n" +
                        "Auditor\n" +
                        "Financial advisors\n" +
                        "Government jobs\n",
                "• English Language (Home or First Additional Language): Level 4\n" +
                        "• Mathematics: Level 4\n" +
                        "• Mathematical Literacy is not acceptable\n" +
                        "• Commerce subjects will be beneficial but are not required",
                3 ,
                "Students who successfully complete this BCom (General) will \n" +
                        "be able to apply for admission to a BCom (Honours) at UMP or \n" +
                        "another Higher Education Institution."
        ));
    }

    public void getba(VisionDaoInsert visionDaoInsert)
    {
        visionDaoInsert.insert(new ump(
                30 ,
                "University of Mpumalanga" ,
                "Bachelor of Arts" ,
                "Art and Design" ,
                "Facilitator\n"+
                        "Researcher\n"+
                        "Creative administrator\n"+
                        "Academics\n"+
                        "Cultural officer\n"+
                        "Recruitment officer\n"
                ,
                "English Language (Home or First Additional Language): Level 4\n" +
                        "Mathematics: Level 2\n" +
                        "Mathematical Literacy: Level 3\n",
                3 ,
                "Applicants with an APS of 35-38, as well as English 6 and" +
                        " Mathematics 6, will be wait-listed subject to place availability."
        ));
    }

    public void getbed(VisionDaoInsert visionDaoInsert)
    {
        visionDaoInsert.insert(new ump(
                28,
                "University of Mpumalanga ",
                "Bachelor of Education: Foundation Phase Teaching (Mathematics)" ,
                "Education" ,
                "Teaching (Grades R-3)\n"+
                        "Educational consultancy\n"+
                        "Specialising in inclusive education at the Foundation Phase"+
                        "Can be linked to other areas such as development studies that allow for opportunities in development projects"+
                        "School management ",
                "English (Home or First Additional Language): Level 4\n" +
                        "Second Recognised Language: Level 4\n" +
                        "Mathematics: Level 3\n" +
                        "Second Recognised Language: Level 4",
                4 ,
                "Students who successfully complete this Bachelor’s Degree\n" +
                        "will be able to apply for admission to Bachelor of Education\n" +
                        "(Honours) in Foundation Phase Teaching at UMP or another\n" +
                        "Higher Education Institution"
        ));
        visionDaoInsert.insert(new ump(
                29,
                "University of Mpumalanga ",
                "Bachelor of Education: Foundation Phase Teaching (Mathematics)" ,
                "Education" ,
                "Teaching (Grades R-3)\n"+
                        "Educational consultancy\n"+
                        "Specialising in inclusive education at the Foundation Phase"+
                        "Can be linked to other areas such as development studies that allow for opportunities in development projects"+
                        "School management ",
                "English (Home or First Additional Language): Level 4\n" +
                        "Second Recognised Language: Level 4\n" +
                        "Mathematical Literacy: Level 4\n" ,
                4 ,
                "Students who successfully complete this Bachelor’s Degree\n" +
                        "will be able to apply for admission to Bachelor of Education\n" +
                        "(Honours) in Foundation Phase Teaching at UMP or another\n" +
                        "Higher Education Institution"
        ));
    }

    public void getbsc(VisionDaoInsert visionDaoInsert)
    {
        visionDaoInsert.insert(new ump(
                30,
                "University of Mpumalanga",
                "Bachelor of Science Degree" ,
                "Sciences" ,
                "Health care provider\n" +
                        "Geological survey departmentn\n" +
                        "Wildlife and fisheries\n" +
                        "Agriculture industry\n" +
                        "Oil industry\n"+
                        "Forensic researcher\n"+
                        "Teaching\n"+
                        "Industrial lab technicians\n"+
                        "Biotechnologist\n"+"" +
                        "Conservation specialist\n"+
                        "Pharmaceuticals and Biotechnology Industry\n"+
                        "Researcher\n"+
                        "Crime researcher\n"+
                        "Environmental manager\n",
                "English (Home or First Additional Language): Level 4\n" +
                        "Mathematics: Level 4\n" +
                        "Mathematical Literacy: Level 6",
                3 ,
                "Students who complete this Degree successfully will be able \n" +
                        "to articulate horizontally and diagonally between this general \n" +
                        "BSc, and our existing BSc (Agriculture). Graduates from the \n" +
                        "BSc will be able to continue into Honours programmes in \n" +
                        "any of the subjects in which they will have majored at UMP or \n" +
                        "another higher education institution."
        ));
    }

    public void gethu(VisionDaoInsert visionDaoInsert)
    {

        visionDaoInsert.insert(new ump(
                26,
                "University of Mpumalanga",
                "Diploma in Hospitality Management(Mathematics)" ,
                "Humanities",
                "Front-office manager\n" +
                        "Banqueting manager\n" +
                        "Hotel manager\n" +
                        "Chef \n" +
                        "Entrepreneur\n" +
                        "Restaurateur\n" +
                        "Coffee shop manager or owner\n" +
                        "Food and beverage manager\n" +
                        "Entrepreneur Restaurateur Caterer\n" +
                        "Guest-house manager or owner",
                        "English Language (Home or First Additional Language): Level 4\n" +
                        " Mathematics: Level 3",
                3 ,
                "Students who successfully complete this Diploma will be\n" +
                        "able to apply for admission to an Advanced Diploma in \n" +
                        "Hospitality Management at UMP or another Higher\n" +
                        "Education Institution."
        ));
        visionDaoInsert.insert(new ump(
            27,
            "University of Mpumalanga",
            "Diploma in Hospitality Management(Mathematical Literacy)" ,
            "Humanities",
            "Front-office manager\n" +
                    "Banqueting manager\n" +
                    "Hotel manager\n" +
                    "Chef \n" +
                    "Entrepreneur\n" +
                    "Restaurateur\n" +
                    "Coffee shop manager or owner\n" +
                    "Food and beverage manager\n" +
                    "Entrepreneur Restaurateur Caterer\n" +
                    "Guest-house manager or owner",
            "English Language (Home or First Additional Language): Level 4\n" +
                    "Mathematical Literacy: Level 4",
            3 ,
            "Students who successfully complete this Diploma will be\n" +
                    "able to apply for admission to an Advanced Diploma in \n" +
                    "Hospitality Management at UMP or another Higher\n" +
                    "Education Institution."
    ));
        visionDaoInsert.insert(new ump(
                31,
                "University of Mpumalanga",
                "Bachelor of Development Studies(Mathematics)" ,
                "Humanities",
                "A local economic development manager\n" +
                        "A project planner\n" +
                        "An environmental officer\n"+
                        "In municipal planning and service delivery",
                "English Language (Home or First Additional Language): Level 4\n" +
                        "Mathematics: Level 2",
                3 ,
                "Students who successfully complete this Bachelor’s \n" +
                        "Degree will be able to apply for admission to the Bachelor of \n" +
                        "Development Studies (Honours) at UMP or another Higher \n" +
                        "Education Institution."
        ));
        visionDaoInsert.insert(new ump(
                32,
                "University of Mpumalanga",
                "Bachelor of Development Studies(Mathematical Literacy)" ,
                "Humanities",
                "A local economic development manager\n" +
                        "A project planner\n" +
                        "An environmental officer\n"+
                        "In municipal planning and service delivery",
                "English Language (Home or First Additional Language): Level 4\n" +
                        "Mathematical Literacy : Level 3",
                3 ,
                "Students who successfully complete this Bachelor’s \n" +
                        "Degree will be able to apply for admission to the Bachelor of \n" +
                        "Development Studies (Honours) at UMP or another Higher \n" +
                        "Education Institution."
        ));
    }
public void getns(VisionDaoInsert visionDaoInsert)
{

    visionDaoInsert.insert(new ump(
            25,
            "University of Mpumalanga",
            "Diploma in Agriculture in Plant Production (Mathematics)" ,
            "Natural Science" ,
            "Farmer\n" +
                    "Production manager\n" +
                    "Farm manager\n"+
                    "Commodity trader\n" +
                    "Agricultural advisor"
            ,
            "English (Home or First Additional Language): Level 4\n" +
                    "Mathematics: Level 3\n" +
                    "Agriculture: Level 4",
            3 ,
            "Students who successfully complete this Diploma will be\n" +
                    "able to apply for admission to an Advanced Diploma in\n" +
                    "Agriculture at UMP or another Higher Education Institution."
    ));
    visionDaoInsert.insert(new ump(
            26,
            "University of Mpumalanga",
            "Diploma in Agriculture in Plant Production (Mathematical Literacy)" ,
            "Natural Science" ,
            "Farmer\n" +
                    "Production manager\n" +
                    "Farm manager\n"+
                    "Commodity trader\n" +
                    "Agricultural advisor"
            ,
            "English (Home or First Additional Language): Level 4\n" +
                    "•Mathematical Literacy: Level 4\n" +
                    "Agriculture: Level 4",
            3 ,
            "Students who successfully complete this Diploma will be\n" +
                    "able to apply for admission to an Advanced Diploma in\n" +
                    "Agriculture at UMP or another Higher Education Institution."
    ));
    visionDaoInsert.insert(new ump(
            32,
            "University of Mpumalanga",
            " Bachelor of Science in Agriculture (Mathematical Literacy)" ,
            "Natural Science" ,
            "Students who complete the degree will immediately be able to work in a number of different agriculturally related fields"
            ,
            "• English (Home or First Additional Language): Level 4\n" +
                    "• Mathematical Literacy: Level 6\n" +
                    "• Life Science: Level 4\n",
            4 ,
            "Students who successfully complete this Bachelor’s Degree \n" +
                    "will be able to apply for admission to Masters’ Degree in \n" +
                    "Agriculture or a Master of Science at UMP or another Higher \n" +
                    "Education Institution."
    ));
    visionDaoInsert.insert(new ump(
            30,
            "University of Mpumalanga",
            " Bachelor of Science in Agriculture (Mathematics)" ,
            "Natural Science" ,
            "Students who complete the degree will immediately be able to work in a number of different agriculturally related fields"
            ,
            "English (Home or First Additional Language): Level 4\n" +
                    "Mathematics: Level 4\n" +
                    "Life Science: Level 4\n",
            4 ,
            "Students who successfully complete this Bachelor’s Degree \n" +
                    "will be able to apply for admission to Masters’ Degree in \n" +
                    "Agriculture or a Master of Science at UMP or another Higher \n" +
                    "Education Institution."
    ));
    visionDaoInsert.insert(new ump(
            29,
            "University of Mpumalanga",
            "Diploma in Nature Conservation (Mathematics)" ,
            "Natural Science" ,
            "Nature reserve managers\n" +
                    "Conservation biology\n" +
                    "Nature conservation and zoology\n" +
                    "In environmental education\n" +
                    "In research offering specialist services such as botany\n" +
                    "Nature conservationists"
            ,
            "English (Home or First Additional Language): Level 4\n" +
                    "Mathematics: Level 2\n" +
                    "One of Life Sciences or Geograph: Level 4",
            3 ,
            "Students who successfully complete this Diploma will be\n" +
                    "able to apply for admission to an Advanced Diploma in\n" +
                    "Nature Conservation at UMP or another Higher Education\n" +
                    "Institution."
    ));
    visionDaoInsert.insert(new ump(
            30,
            "University of Mpumalanga",
            "Diploma in Nature Conservation (Mathematical Literacy)" ,
            "Natural Science" ,
            "Nature reserve managers\n" +
                    "Conservation biology\n" +
                    "Nature conservation and zoology\n" +
                    "In environmental education\n" +
                    "In research offering specialist services such as botany\n" +
                    "Nature conservationists"
            ,
            "English (Home or First Additional Language): Level 4\n" +
                    "Mathematical Literacy: Level 3\n" +
                    "One of Life Sciences or Geograph: Level 4",
            3 ,
            "Students who successfully complete this Diploma will be\n" +
                    "able to apply for admission to an Advanced Diploma in\n" +
                    "Nature Conservation at UMP or another Higher Education\n" +
                    "Institution."
    ));
}
    public void getit(VisionDaoInsert visionDaoInsert)
    {
        visionDaoInsert.insert(new ump(
                26,
                "University of Mpumalanga",
                "Diploma in ICT (Applications Development)" ,
                "Information Technology" ,
                "Database administrator\n" +
                        "Systems analyst\n" +
                        "Other numerous entrepreneurial opportunities\n"+
                        "Systems developer\n" +
                        "Support specialist"+
                        "Programmer"
                ,
                "English (Home or First Additional Language): Level 4\n" +
                        "Mathematics: Level 4",
                3 ,
                "Students who successfully complete this Diploma will be\n" +
                        "able to apply for admission to an Advanced Diploma in\n" +
                        "ICT at UMP or another Higher Education Institution."
        ));
    }
    public void getnas(VisionDaoInsert visionDaoInsert)
    {
        visionDaoInsert.insert(new ump(
                25,
                "University of Mpumalanga",
                "DIPLOMA IN AGRICULTURE IN PLANT PRODUCTION (Mathematical Literacy)" ,
                "Natural Science" ,
                "Agricultural advisor\n" +
                        "Commodity trader\n" +
                        "Production manager\n"+
                        "Farm manager\n"+
                        "Farmer"
                ,
                "English (Home or First Additional Language): Level 4\n" +
                        "Mathematical Literacy: Level 4\n"+
                        "Agriculture: Level 4",
                3 ,
                "Students who successfully complete this Diploma will be\n" +
                        "able to apply for admission to an Advanced Diploma in\n" +
                        "Agriculture at UMP or another Higher Education Institution."
        ));
        visionDaoInsert.insert(new ump(
                26,
                "University of Mpumalanga",
                "DIPLOMA IN AGRICULTURE IN PLANT PRODUCTION(Mathematics)" ,
                "Natural Science" ,
                "Agricultural advisor\n" +
                        "Commodity trader\n" +
                        "Production manager\n"+
                        "Farm manager\n"+
                        "Farmer"
                ,
                "English (Home or First Additional Language): Level 4\n" +
                        "Mathematics: Level 3\n"+
                        "Agriculture: Level 4",
                3 ,
                "Students who successfully complete this Diploma will be\n" +
                        "able to apply for admission to an Advanced Diploma in\n" +
                        "Agriculture at UMP or another Higher Education Institution."
        ));
        visionDaoInsert.insert(new ump(
                29,
                "University of Mpumalanga",
                "DIPLOMA IN NATURE CONSERVATION(Mathematics)" ,
                "Natural Science" ,
                "Nature reserve managers\n"+
                        "Nature conservation and zoology\n"+
                        "In environmental education\n"+
                        "Nature conservationists\n"+
                        "Conservation biology"
                ,
                "English (Home or First Additional Language): Level 4\n" +
                        "Mathematics: Level 2\n"+
                        "One of Life Sciences or Geography: Level 4\n",
                3 ,
                "Students who successfully complete this Diploma will be\n" +
                        "able to apply for admission to an Advanced Diploma in\n" +
                        "Nature Conservation at UMP or another Higher Education\n" +
                        "Institution."
        ));
        visionDaoInsert.insert(new ump(
                30,
                "University of Mpumalanga",
                "DIPLOMA IN NATURE CONSERVATION(Mathematical Literacy)" ,
                "Natural Science" ,
                "Nature reserve managers\n"+
                        "Nature conservation and zoology\n"+
                        "In environmental education\n"+
                        "Nature conservationists\n"+
                        "Conservation biology"
                ,
                "English (Home or First Additional Language): Level 4\n" +
                        "Mathematical Literacy: Level 3\n"+
                        "One of Life Sciences or Geography: Level 4\n",
                3 ,
                "Students who successfully complete this Diploma will be\n" +
                        "able to apply for admission to an Advanced Diploma in\n" +
                        "Nature Conservation at UMP or another Higher Education\n" +
                        "Institution."
        ));
    }

}
