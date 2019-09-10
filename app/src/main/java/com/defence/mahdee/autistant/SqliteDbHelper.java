package com.defence.mahdee.autistant;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class SqliteDbHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "autistant";
    public static final int DATABASE_VERSION = 1;


    public static final String CREATE_TABLE1 = "create table cardio(name text,degree text,contact text,hospital text,chamber text);";
    public static final String CREATE_TABLE2 = "create table dermato(name text,degree text,contact text,hospital text,chamber text);";
    public static final String CREATE_TABLE3 = "create table nephro(name text,degree text,contact text,hospital text,chamber text);";
    public static final String CREATE_TABLE4 = "create table neuro(name text,degree text,contact text,hospital text,chamber text);";
    public static final String CREATE_TABLE5 = "create table medicine(name text,degree text,contact text,hospital text,chamber text);";
    public static final String CREATE_TABLE6 = "create table ortho(name text,degree text,contact text,hospital text,chamber text);";
    public static final String CREATE_TABLE7 = "create table uro(name text,degree text,contact text,hospital text,chamber text);";
    public static final String CREATE_TABLE8 = "create table dentists(name text,degree text,contact text,hospital text,chamber text);";
    public static final String CREATE_TABLE9 = "create table ent(name text,degree text,contact text,hospital text,chamber text);";
    public static final String CREATE_TABLE10 = "create table speech(name text,degree text,contact text,hospital text,chamber text);";
    public static final String CREATE_TABLE11 = "create table vision(name text,degree text,contact text,hospital text,chamber text);";
    public static final String CREATE_TABLE12 = "create table pedi(name text,degree text,contact text,hospital text,chamber text);";
    public static final String CREATE_TABLE13 = "create table diet(name text,degree text,contact text,hospital text,chamber text);";

    public static final String CREATE_TABLE14 = "create table hospital(name text,address text,loc text,contact text);";
    public static final String CREATE_TABLE15 = "create table school(name text,address text,loc text,contact text);";

    public static final String DROP_TABLE1 = "drop table if exists cardio";
    public static final String DROP_TABLE2 = "drop table if exists dermato";
    public static final String DROP_TABLE3 = "drop table if exists nephro";
    public static final String DROP_TABLE4 = "drop table if exists neuro";
    public static final String DROP_TABLE5 = "drop table if exists medicine";
    public static final String DROP_TABLE6 = "drop table if exists ortho";
    public static final String DROP_TABLE7 = "drop table if exists uro";
    public static final String DROP_TABLE8 = "drop table if exists dentists";
    public static final String DROP_TABLE9 = "drop table if exists ent";
    public static final String DROP_TABLE10 = "drop table if exists speech";
    public static final String DROP_TABLE11 = "drop table if exists vision";
    public static final String DROP_TABLE12 = "drop table if exists pedi";
    public static final String DROP_TABLE13 = "drop table if exists diet";

    public static final String DROP_TABLE14 = "drop table if exists hospital";
    public static final String DROP_TABLE15 = "drop table if exists school";


    public SqliteDbHelper(Context context){
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
        Log.d("Database operation","Database created..");
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE1);
        db.execSQL(CREATE_TABLE2);
        db.execSQL(CREATE_TABLE3);
        db.execSQL(CREATE_TABLE4);
        db.execSQL(CREATE_TABLE5);
        db.execSQL(CREATE_TABLE6);
        db.execSQL(CREATE_TABLE7);
        db.execSQL(CREATE_TABLE8);
        db.execSQL(CREATE_TABLE9);
        db.execSQL(CREATE_TABLE10);
        db.execSQL(CREATE_TABLE11);
        db.execSQL(CREATE_TABLE12);
        db.execSQL(CREATE_TABLE13);
        db.execSQL(CREATE_TABLE14);
        db.execSQL(CREATE_TABLE15);



        cardioData(db);
        dermatoData(db);
        nephroData(db);
        neuroData(db);
        medicineData(db);
        orthoData(db);
        uroData(db);
        dentistsData(db);
        entData(db);
        speechData(db);
        visionData(db);
        pediData(db);
        dietData(db);

        hospitalData(db);
        schoolData(db);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(DROP_TABLE1);
        db.execSQL(DROP_TABLE2);
        db.execSQL(DROP_TABLE3);
        db.execSQL(DROP_TABLE4);
        db.execSQL(DROP_TABLE5);
        db.execSQL(DROP_TABLE6);
        db.execSQL(DROP_TABLE7);
        db.execSQL(DROP_TABLE8);
        db.execSQL(DROP_TABLE9);
        db.execSQL(DROP_TABLE10);
        db.execSQL(DROP_TABLE11);
        db.execSQL(DROP_TABLE12);
        db.execSQL(DROP_TABLE13);
        db.execSQL(DROP_TABLE14);
        db.execSQL(DROP_TABLE15);
        onCreate(db);
    }

    public Cursor readCardio(SQLiteDatabase database){
        String[] projections = {"name","degree","contact","hospital","chamber"};

        Cursor cursor = database.query("cardio",
                projections,null,null,null,null,null);

        return cursor;

    }

    public Cursor readDermato(SQLiteDatabase database){
        String[] projections = {"name","degree","contact","hospital","chamber"};

        Cursor cursor = database.query("dermato",
                projections,null,null,null,null,null);

        return cursor;

    }

    public Cursor readNephro(SQLiteDatabase database){
        String[] projections = {"name","degree","contact","hospital","chamber"};

        Cursor cursor = database.query("nephro",
                projections,null,null,null,null,null);

        return cursor;

    }

    public Cursor readOrtho(SQLiteDatabase database){
        String[] projections = {"name","degree","contact","hospital","chamber"};

        Cursor cursor = database.query("ortho",
                projections,null,null,null,null,null);

        return cursor;

    }

    public Cursor readNeuro(SQLiteDatabase database){
        String[] projections = {"name","degree","contact","hospital","chamber"};

        Cursor cursor = database.query("neuro",
                projections,null,null,null,null,null);

        return cursor;

    }

    public Cursor readMedicine(SQLiteDatabase database){
        String[] projections = {"name","degree","contact","hospital","chamber"};

        Cursor cursor = database.query("medicine",
                projections,null,null,null,null,null);

        return cursor;

    }

    public Cursor readUro(SQLiteDatabase database){
        String[] projections = {"name","degree","contact","hospital","chamber"};

        Cursor cursor = database.query("uro",
                projections,null,null,null,null,null);

        return cursor;

    }

    public Cursor readDentists(SQLiteDatabase database){
        String[] projections = {"name","degree","contact","hospital","chamber"};

        Cursor cursor = database.query("dentists",
                projections,null,null,null,null,null);

        return cursor;

    }

    public Cursor readVision(SQLiteDatabase database){
        String[] projections = {"name","degree","contact","hospital","chamber"};

        Cursor cursor = database.query("vision",
                projections,null,null,null,null,null);

        return cursor;

    }

    public Cursor readEnt(SQLiteDatabase database){
        String[] projections = {"name","degree","contact","hospital","chamber"};

        Cursor cursor = database.query("ent",
                projections,null,null,null,null,null);

        return cursor;

    }

    public Cursor readSpeech(SQLiteDatabase database){
        String[] projections = {"name","degree","contact","hospital","chamber"};

        Cursor cursor = database.query("speech",
                projections,null,null,null,null,null);

        return cursor;

    }

    public Cursor readPedi(SQLiteDatabase database){
        String[] projections = {"name","degree","contact","hospital","chamber"};

        Cursor cursor = database.query("pedi",
                projections,null,null,null,null,null);

        return cursor;

    }

    public Cursor readDiet(SQLiteDatabase database){
        String[] projections = {"name","degree","contact","hospital","chamber"};

        Cursor cursor = database.query("diet",
                projections,null,null,null,null,null);

        return cursor;

    }

    public Cursor readHospital(SQLiteDatabase database){
        String[] projections = {"name","address","contact","loc"};

        Cursor cursor = database.query("hospital",
                projections,null,null,null,null,null);

        return cursor;

    }

    public Cursor readSchool(SQLiteDatabase database){
        String[] projections = {"name","address","contact","loc"};

        Cursor cursor = database.query("school",
                projections,null,null,null,null,null);

        return cursor;

    }

    public void cardioData(SQLiteDatabase db){
        ContentValues contentValues = new ContentValues();

        contentValues.put("name","Prof. Dr. Abdullah-Al-Safi");
        contentValues.put("degree","MBBS, D.Card, MD(Card), FACC, FSGC, FRCP");
        contentValues.put("hospital","National Institute of Cardiovascular Disease");
        contentValues.put("chamber","Popular Diagnostic Center (Dhanmondi Branch) House# 16, Road# 2, Dhanmondi R/A, Dhaka 1205");
        contentValues.put("contact","02-9661491");
        db.insert("cardio",null,contentValues);
        contentValues.clear();

        contentValues.put("name","Prof. Dr. Mohammad Safiuddin");
        contentValues.put("degree","MBBS, MD(Cardiology), DTCD, FRCP(Edin), FACC, FCCP, FESC, FRCP");
        contentValues.put("hospital","Bangabandhu Sheikh Mujib Medical University ");
        contentValues.put("chamber","Popular Medical College Hospital (Consultant Center)\n" +
                "House# 16, Road# 2, Dhanmondi R/A, Dhaka 1205");
        contentValues.put("contact","02-9661491");
        db.insert("cardio",null,contentValues);
        contentValues.clear();

        contentValues.put("name","Prof. Dr. Md. Fakhrul Islam");
        contentValues.put("degree","MBBS, MD(Cardiology), FESC, FACC");
        contentValues.put("hospital","Labaid Cardiac Hospital");
        contentValues.put("chamber","Labaid Cardiac Hospital\n" +
                "House# 1, Road# 4, Dhanmondi, DHaka 1205");
        contentValues.put("contact","02-8631177");
        db.insert("cardio",null,contentValues);
        contentValues.clear();

        contentValues.put("name","Dr. H. I. Lutfor Rahman Khan");
        contentValues.put("degree","MBBS, D.Card, MD(Card)");
        contentValues.put("hospital","Dhaka Medical College & Hospital");
        contentValues.put("chamber","Comfort Diagnostic Center\n" +
                "167/B Green Road, Dhaka 1205");
        contentValues.put("contact","02-9135945");
        db.insert("cardio",null,contentValues);
        contentValues.clear();

        contentValues.put("name","Prof. Dr. Md. Afjalur Rahman");
        contentValues.put("degree","MBBS, MD(Cardiology), PHD(Cardiology), FRCP, FACC");
        contentValues.put("hospital","Sir Solimullah Medical College & Mitford Hospital");
        contentValues.put("chamber","Labaid Cardiac Hospital\n" +
                "House# 1, Road# 4, Dhanmondi, DHaka 1205");
        contentValues.put("contact","02-8631177");
        db.insert("cardio",null,contentValues);
        contentValues.clear();

        contentValues.put("name","Prof. Dr. Abu Zafar");
        contentValues.put("degree","MBBS, MRCP, FRCP");
        contentValues.put("hospital","Bangabandhu Sheikh Mujib Medical University ");
        contentValues.put("chamber","Ibn Sina Diagnostic & Imaging Center\n" +
                "House# 48, Road# 9/A, Dhanmondi, Dhaka 1209");
        contentValues.put("contact","02-9126625");
        db.insert("cardio",null,contentValues);
        contentValues.clear();

        contentValues.put("name","Prof. Dr. Nasir Uddin Ahmed");
        contentValues.put("degree","MBBS, MS, FICS");
        contentValues.put("hospital","National Institute of Cardiovascular Disease");
        contentValues.put("chamber","Rainbow Heart Consultation Center\n" +
                "House# 75, Satmashjid Road, Sankar Bus Stand, Dhanmondi, Dhaka 1209");
        contentValues.put("contact","02-9131207");
        db.insert("cardio",null,contentValues);
        contentValues.clear();

        contentValues.put("name","Prof. Dr. Munshi Md. Mujibur Rahman");
        contentValues.put("degree","MBBS, FCPS, MCPS, FICS");
        contentValues.put("hospital","Combined ilitary Hospital (CMH)");
        contentValues.put("chamber","Green Life Hospital\n" +
                "32, Green Road, Dhaka 1205");
        contentValues.put("contact","02-9616074");
        db.insert("cardio",null,contentValues);
        contentValues.clear();

        contentValues.put("name","Prof. Dr. Momenuzzaman");
        contentValues.put("degree","MBBS, D.Card, MD(Card)");
        contentValues.put("hospital","United Hospital Ltd");
        contentValues.put("chamber","United Hospital Ltd\n" +
                "Plot# 15, Road# 71, Gulshan 2, Dhaka 1212");
        contentValues.put("contact","02-8836444");
        db.insert("cardio",null,contentValues);
        contentValues.clear();

        contentValues.put("name","Prof. Dr. Syed Ali Khan");
        contentValues.put("degree","MBBS, MD(Card), FICC, AACC");
        contentValues.put("hospital","Bangabandhu Sheikh Mujib Medical University");
        contentValues.put("chamber","Anwer Khan Modern Hospital Ltd\n" +
                "House# 17, Road#8, Dhanmondi, Dhaka 1205");
        contentValues.put("contact","02-8613883");
        db.insert("cardio",null,contentValues);
        contentValues.clear();
    }

    public void dermatoData(SQLiteDatabase db){
        ContentValues contentValues = new ContentValues();

        contentValues.put("name","Associate Prof. Dr. Hosne Ara Begum");
        contentValues.put("degree","MBBS, DDV, FCPS");
        contentValues.put("hospital","BIRDEM General Hospital & Ibrahim Medical College");
        contentValues.put("chamber","Women and Children Hospital\n" +
                "Road# 9/A, Dhanmondi, Dhaka 1209");
        contentValues.put("contact","01711434771");
        db.insert("dermato",null,contentValues);
        contentValues.clear();

        contentValues.put("name","Dr. A. S. Mofreuddin Ahmed");
        contentValues.put("degree","MBBS, DDV");
        contentValues.put("hospital","Ibn Sina Consultation Center");
        contentValues.put("chamber","Ibn Sina Consultation Center\n" +
                "House# 58, Road# 2/A, Dhanmondi R/A, Dhaka 1209");
        contentValues.put("contact","02-9666497");
        db.insert("dermato",null,contentValues);
        contentValues.clear();

        contentValues.put("name","Dr. A. S. M. Zakariya");
        contentValues.put("degree","MBBS, MPH, MD(Skin)");
        contentValues.put("hospital","Bangabandhu SHeikh Mujib Medical University");
        contentValues.put("chamber","Central Hospital\n" +
                "18 Green Road, Dhaka 1205");
        contentValues.put("contact","02-9121592");
        db.insert("dermato",null,contentValues);
        contentValues.clear();

        contentValues.put("name","Dr. A.T.M. Asaduzzaman");
        contentValues.put("degree","MBBS, MD(Skin)");
        contentValues.put("hospital","Bangabandhu Sheikh Mujib Medical University");
        contentValues.put("chamber","Japan Bangladesh Friendship Hospital\n" +
                "House# 55, Road# 3/A, Zigatola Bus Stand, Dhanmondi, Dhaka 1205");
        contentValues.put("contact","02-9664028");
        db.insert("dermato",null,contentValues);
        contentValues.clear();

        contentValues.put("name","Dr. Abdul Quaium Chowdhury");
        contentValues.put("degree","MBBS, SDDV");
        contentValues.put("hospital","Cunsultant");
        contentValues.put("chamber","Panpcific Hospital \n" +
                "24 Outer Circular Road, Motijheel, Dhaka 1217");
        contentValues.put("contact","02-9349794");
        db.insert("dermato",null,contentValues);
        contentValues.clear();

        contentValues.put("name","Dr. Abul Farah");
        contentValues.put("degree","MBBS, DCM, DDV, MCPS");
        contentValues.put("hospital","Islami Bank Central Hospital");
        contentValues.put("chamber","Islami Bank Central Hospital\n" +
                "30 V.I.P. Road, Kakrail, Dhaka 1000");
        contentValues.put("contact","02-9360331");
        db.insert("dermato",null,contentValues);
        contentValues.clear();

        contentValues.put("name","Dr. Ahammad Ali");
        contentValues.put("degree","MBBS, DDV, DTM");
        contentValues.put("hospital","Medinova Consultation Center 2");
        contentValues.put("chamber","Medinova Consultation Center 2\n" +
                "House# 71/A, Road# 5/A, Dhanmondi R/A, Dhaka 1205");
        contentValues.put("contact","02-8624907");
        db.insert("dermato",null,contentValues);
        contentValues.clear();

        contentValues.put("name","Dr. Chowdhury Mohammad Ali");
        contentValues.put("degree","MBBS, DDV");
        contentValues.put("hospital","Begum Khaleda Zia Medical College");
        contentValues.put("chamber","City Hospital Ltd\n" +
                "1/8, Block# E, Lalmatia, Dhaka 1207");
        contentValues.put("contact","02-8143913");
        db.insert("dermato",null,contentValues);
        contentValues.clear();

        contentValues.put("name","Dr. Didarul Islam");
        contentValues.put("degree","MBBS, DDV");
        contentValues.put("hospital","Consultant");
        contentValues.put("chamber","Al-Raji Hospital\n" +
                "12 Farmgate, Dhaka 1215");
        contentValues.put("contact","02-8121172");
        db.insert("dermato",null,contentValues);
        contentValues.clear();

        contentValues.put("name","Associate Prof. Dr. M. M. Insan");
        contentValues.put("degree","MBBS, DD");
        contentValues.put("hospital","Comfort Diagnostic Center PVT. LTD.");
        contentValues.put("chamber","Comfort Diagnostic Center PVT. LTD.\n" +
                "167/B Green Road, Dhaka 1205");
        contentValues.put("contact","02-9121592");
        db.insert("dermato",null,contentValues);
        contentValues.clear();
    }

    public void nephroData(SQLiteDatabase db){
        ContentValues contentValues = new ContentValues();

        contentValues.put("name","Prof. Dr. Muhammad Rafiqul Alam");
        contentValues.put("degree","MBBS, MD(Nephrology), Fcps(Medicine)");
        contentValues.put("hospital","Labaid Hospital Ltd. Dhanmondi, Dhaka");
        contentValues.put("chamber","Labaid Specialized Hospital Ltd\n" +
                "House# 1, Road# 4, Dhanmondi, Dhaka 1205");
        contentValues.put("contact","029670210");
        db.insert("nephro",null,contentValues);
        contentValues.clear();

        contentValues.put("name","Prof. Dr. Md. Abul Mansur");
        contentValues.put("degree","MBBS, MD, Dip. in Nephro");
        contentValues.put("hospital","BIRDEM");
        contentValues.put("chamber","BIRDEM\n" +
                "122 Kazi Nazrul Islam Avenue, Shahbagh, Dhaka 1000");
        contentValues.put("contact","028616641");
        db.insert("nephro",null,contentValues);
        contentValues.clear();

        contentValues.put("name","Prof. Dr. Md. Nizamuddin Chowdhury");
        contentValues.put("degree","MBBS, MCPS, MD (Nephrology), FASN (USA), Fellow ISN (Canada)");
        contentValues.put("hospital","Dhaka Medical College & Hospital");
        contentValues.put("chamber","Popular Diagnostic Centre Ltd - Dhanmondi Branch\n" +
                "House# 16, Road# 2, Dhanmondi R/A, Dhaka 1205");
        contentValues.put("contact","029661491");
        db.insert("nephro",null,contentValues);
        contentValues.clear();

        contentValues.put("name","Prof. Dr. Md. Jahangir Kobir");
        contentValues.put("degree","FCPS (Medicine) FCW (Kidney)UK");
        contentValues.put("hospital","National Institute of Kidney Disease & Urology");
        contentValues.put("chamber","City Hospital Ltd\n" +
                "1/8, Block-E, Lalmatia, Satmosjid Road, Mohammadpur, Dhaka 1207");
        contentValues.put("contact","028143437");
        db.insert("nephro",null,contentValues);
        contentValues.clear();

        contentValues.put("name","Prof. Dr. Matiur Rahman");
        contentValues.put("degree","MBBS (Dak), MRCP (UK), FCPS (BD), FRCP (ED)");
        contentValues.put("hospital","Comfort Diagnostic Centre Pvt. Ltd.");
        contentValues.put("chamber","Comfort Diagnostic Centre Pvt. Ltd.\n" +
                "167/B, Green Road, Dhaka 1205 ");
        contentValues.put("contact","028129667");
        db.insert("nephro",null,contentValues);
        contentValues.clear();

        contentValues.put("name","Prof. Dr. Md. Shahidul Islam ");
        contentValues.put("degree","MBBS, MCPS, MD, FACP, FASN(USA), FRCP(Edin)");
        contentValues.put("hospital","Bangabandhu Sheikh Mujib Medical Univeristy");
        contentValues.put("chamber","Doctors Diagnostic Center Ltd\n" +
                "Road # 7,  Dhanmondi, Dhaka 1205");
        contentValues.put("contact","028115300");
        db.insert("nephro",null,contentValues);
        contentValues.clear();

        contentValues.put("name","Prof. Dr. Nurul Islam");
        contentValues.put("degree","MBBS, MRCP (UK) , FRCP (Edin)");
        contentValues.put("hospital","United Hospital Limited");
        contentValues.put("chamber","United Hospital Limited\n" +
                "Plot# 15, Road# 71, Gulshan 2, Dhaka 1212\n");
        contentValues.put("contact","028836444");
        db.insert("nephro",null,contentValues);
        contentValues.clear();

        contentValues.put("name","Prof. Dr. Md. Firoz Khan");
        contentValues.put("degree","MBBS, MD, FRCP (England) , ISN fello (Japan)");
        contentValues.put("hospital","National Institute of Kidney Disease and Urology");
        contentValues.put("chamber","Anwer Khan Modern Hospital Ltd\n" +
                "House# 17, Road# 8, Dhanmondi, Dhaka 1205");
        contentValues.put("contact","028613883");
        db.insert("nephro",null,contentValues);
        contentValues.clear();

        contentValues.put("name","Dr. Masum kamal Khan");
        contentValues.put("degree","MBBS, FCPS, MD (Nephrology)");
        contentValues.put("hospital","Bangabandhu Sheikh Mujib Medical Univeristy");
        contentValues.put("chamber","Ibn Sina Medical Imaging Center\n" +
                "House# 58, Road# 2/A , Dhanmondi, Dhaka 1209");
        contentValues.put("contact","029663289");
        db.insert("nephro",null,contentValues);
        contentValues.clear();

        contentValues.put("name","Dr. Md. Anisur Rahman");
        contentValues.put("degree","MBBS, MD (Nephrology)");
        contentValues.put("hospital","BIRDEM");
        contentValues.put("chamber","Khidmah Hospital Pvt. Ltd\n" +
                "C-287/2-3, Malibag Bishwa Road, Khilgaon, Dhaka 1219");
        contentValues.put("contact","027219220");
        db.insert("nephro",null,contentValues);
        contentValues.clear();
    }

    public void neuroData(SQLiteDatabase db){
        ContentValues contentValues = new ContentValues();

        contentValues.put("name","Prof. Dr. Mansur Habib");
        contentValues.put("degree","MBBS, FCPS (Medicine), MD (Neurology), MRCP, FRCP");
        contentValues.put("hospital","Dhaka Medical College & Hospital");
        contentValues.put("chamber","Labaid Cardiac Hospital\n" +
                "House# 1, Road# 4, Dhanmondi, Dhaka 1205");
        contentValues.put("contact","029670210");
        db.insert("neuro",null,contentValues);
        contentValues.clear();

        contentValues.put("name","Prof. Dr. Md. Abdul Hai");
        contentValues.put("degree","MBBS, FCPS (Medicine),MD (Neuro),PhD (India),FRCP (Edin),Fellow (Interventional Neurology)");
        contentValues.put("hospital","Sir Salimullah Medical College and Mitford Hospital");
        contentValues.put("chamber","Ibn Sina Diagnostic & Imaging Center\n" +
                "House# 48, Road# 9/A, Dhanmondi, Dhaka 1209");
        contentValues.put("contact","029128835");
        db.insert("neuro",null,contentValues);
        contentValues.clear();

        contentValues.put("name","Prof. Dr. M. A. Mannan");
        contentValues.put("degree","MBBS, FRCP");
        contentValues.put("hospital","Neurology Foundation Hospital");
        contentValues.put("chamber","Neurology Foundation Hospital\n" +
                "3/1 Lake Circus, Kalabagan, Dhaka 1205");
        contentValues.put("contact","028114846");
        db.insert("neuro",null,contentValues);
        contentValues.clear();

        contentValues.put("name","Prof. Dr. Syed Wahidur Rahman");
        contentValues.put("degree","MBBS, FCPS (Medicine)");
        contentValues.put("hospital","Suhrawardy Medical College & Hospital");
        contentValues.put("chamber","Popular Diagnostic Centre Ltd \n" +
                "House# 11/A, Road# 2, Dhanmondi R/A, Dhaka 1205");
        contentValues.put("contact","029661491");
        db.insert("neuro",null,contentValues);
        contentValues.clear();

        contentValues.put("name","Prof. Dr. A.K.M. Anwar Ullah");
        contentValues.put("degree","MBBS, FCPS, FRCP(Adin)");
        contentValues.put("hospital","Bangabandhu Sheikh Mujib Medical University");
        contentValues.put("chamber","Medinova Medical Services Ltd\n" +
                "House# 71/A, Road# 5/A, Dhanmondi R/A, Dhaka 1207");
        contentValues.put("contact","029663022");
        db.insert("neuro",null,contentValues);
        contentValues.clear();

        contentValues.put("name","Dr. Abu Nasar Rizvi");
        contentValues.put("degree","MBBS, MD (Neurology), WFNJT Fellowship (USA)");
        contentValues.put("hospital","Bangabandhu Sheikh Mujib Medical University");
        contentValues.put("chamber","Comfort Diagnostic Centre & Comfort Nursing Home\n" +
                "167/B, Green Road, Dhaka 1205");
        contentValues.put("contact","028129667");
        db.insert("neuro",null,contentValues);
        contentValues.clear();

        contentValues.put("name","Dr. A.K. Takib Uddin Ahmed");
        contentValues.put("degree","MBBS, MD");
        contentValues.put("hospital","Sir Salimullah Medical College & Mitford Hospital");
        contentValues.put("chamber","Islami Bank Central Hospital\n" +
                "30, Anjuman-e-Mofidul Islam Road, Kakrail, Dhaka 1000");
        contentValues.put("contact","029360331");
        db.insert("neuro",null,contentValues);
        contentValues.clear();

        contentValues.put("name","Dr. Md. Badrul Alam");
        contentValues.put("degree","MBBS, MD (Neurology)");
        contentValues.put("hospital","Dhaka Medical College");
        contentValues.put("chamber","Central Hospital Limited\n" +
                "House# 2, Road# 5, Dhanmondi, Dhaka 1205");
        contentValues.put("contact","028624514");
        db.insert("neuro",null,contentValues);
        contentValues.clear();
    }

    public void medicineData(SQLiteDatabase db){
        ContentValues contentValues = new ContentValues();

        contentValues.put("name","Prof. Dr. R. K. Saha");
        contentValues.put("degree","MBBS, FCPS (Med)");
        contentValues.put("hospital","Uttara Crescent Hospital and Uttara Aichi Hospital");
        contentValues.put("chamber","Uttara Crescent Hospital and Uttara Aichi Hospital");
        contentValues.put("contact","01711245746");
        db.insert("medicine",null,contentValues);
        contentValues.clear();

        contentValues.put("name","Dr. Afsana Begum");
        contentValues.put("degree","MBBS, FCPS");
        contentValues.put("hospital","United Hospital Limited");
        contentValues.put("chamber","United Hospital Limited\n" +
                "Plot# 15, Road# 71, Gulshan 2, Dhaka 1212");
        contentValues.put("contact","028836444");
        db.insert("medicine",null,contentValues);
        contentValues.clear();

        contentValues.put("name","Dr. Anup Kumar Saha");
        contentValues.put("degree","MBBS, FCPS (Medicine), MD (Internal Medicine), FACP (America)");
        contentValues.put("hospital","Sir Salimullah Medical College and Mitford Hospital");
        contentValues.put("chamber","Monowara Hospital pvt. Ltd\n" +
                "54, Siddeshwari Road, Dhaka 1217");
        contentValues.put("contact","028319802");
        db.insert("medicine",null,contentValues);
        contentValues.clear();

        contentValues.put("name","Dr. Md. Abul Kalam Azad");
        contentValues.put("degree","MBBS, FCPS");
        contentValues.put("hospital","Bangabandhu Sheikh Mujib Medical University");
        contentValues.put("chamber","Padma Diagnostic Center Ltd\n" +
                "245/2, New Circular Road, Malibagh, Dhaka");
        contentValues.put("contact","029351237");
        db.insert("medicine",null,contentValues);
        contentValues.clear();

        contentValues.put("name","Prof. Dr. Mirza Mohammad Hiron");
        contentValues.put("degree","FCPS (medicine), MD (Chest), FCCP (USA),FRCP (Ireland), FRCP (Edin), FRCP (Glasgow)");
        contentValues.put("hospital","National Institute of Diseases of the Chest and Hospital");
        contentValues.put("chamber","Ibn Sina Diagnostic & Imaging Center\n" +
                "House # 48, Road# 9/A, Dhanmondi,, Dhaka 1209");
        contentValues.put("contact","0291288357");
        db.insert("medicine",null,contentValues);
        contentValues.clear();

        contentValues.put("name","Prof. Dr. M. A. Wahab");
        contentValues.put("degree","MBBS, MRSH(London), FICA(USA), MRCP, DTCD, FRCP");
        contentValues.put("hospital","Holy Family Red Crescent Medical College and Hospital");
        contentValues.put("chamber","Doctors Diagnostic Center Ltd\n" +
                "Road# 7, Dhanmondi, Dhaka 1205");
        contentValues.put("contact","02912306");
        db.insert("medicine",null,contentValues);
        contentValues.clear();
    }

    public void orthoData(SQLiteDatabase db){
        ContentValues contentValues = new ContentValues();

        contentValues.put("name","PROF. DR. M S ZAMAN SHAHIN");
        contentValues.put("degree","MBBS, MS (Ortho-Surgery), Plastic Surgery (RIHD)");
        contentValues.put("hospital","DHAKA MEDICAL COLLEGE HOSPITAL");
        contentValues.put("chamber","THE BARAKAH GENERAL HOSPITAL LTD\n" +
                "937 Outer Circular Road, Rajarbag, Dhaka-1217");
        contentValues.put("contact","029346265");
        db.insert("ortho",null,contentValues);
        contentValues.clear();

        contentValues.put("name","Dr. Amit Kapoor");
        contentValues.put("degree","MBBS, MS (Ortho), DNB (Ortho)");
        contentValues.put("hospital","Apollo HospitalChamber: Apollo Hospitals Dhaka");
        contentValues.put("chamber","Apollo HospitalChamber: Apollo Hospitals Dhaka\n" +
                "Plot# 81, Block# E, Bashundhara R/A, Dhaka 1229");
        contentValues.put("contact","028401661");
        db.insert("ortho",null,contentValues);
        contentValues.clear();

        contentValues.put("name","Dr. Abu Jafar Chowdhury");
        contentValues.put("degree","MBBS, MS (Ortho)");
        contentValues.put("hospital","Bangabandhu Sheikh Mujib Medical University");
        contentValues.put("chamber","Labaid Specialized Hospital\n" +
                "House# 6, Road# 4, Dhanmondi, Dhaka 1205");
        contentValues.put("contact","028610793");
        db.insert("ortho",null,contentValues);
        contentValues.clear();

        contentValues.put("name","Professor M. K. I. Qayyum Chowdhury");
        contentValues.put("degree","MBBS, MS (Ortho), F.I.C.S, F.A.C.S (USA)");
        contentValues.put("hospital","Ibrahim Memorial Medical College & Hospital");
        contentValues.put("chamber","Dhaka Central Hospital\n" +
                "Road no# 5, Green Road, Dhaka");
        contentValues.put("contact","028624515");
        db.insert("ortho",null,contentValues);
        contentValues.clear();

        contentValues.put("name","Prof. Dr. Md. Siraj-Ul-Islam");
        contentValues.put("degree","MBBS, MS (Ortho)");
        contentValues.put("hospital","National Orthopedic Hospital & Rehabilitation Institution");
        contentValues.put("chamber","Comfort Diagnostic Centre & Comfort Nursing Home \n" +
                "167/B, Green Road, Dhaka");
        contentValues.put("contact","028129667");
        db.insert("ortho",null,contentValues);
        contentValues.clear();

        contentValues.put("name","Professor Dr. Qazi Shahidul Alam");
        contentValues.put("degree","MBBS, D.Orth, MS (Orth), FICS (USA)");
        contentValues.put("hospital","Modern Diagnostic Center Ltd");
        contentValues.put("chamber","Anwer Khan Modern Hospital Ltd\n" +
                "House 17, Road 8, Dhanmondi, Dhaka");
        contentValues.put("contact","028616074");
        db.insert("ortho",null,contentValues);
        contentValues.clear();

        contentValues.put("name","Dr. Md. Jahangir Alam");
        contentValues.put("degree","MBBS, MS (Ortho)");
        contentValues.put("hospital","National Institute of Trumatology and Rehalition");
        contentValues.put("chamber","Care Hospital Ltd\n" +
                "2/1-A Iqbal Road, Mohammadpur, Dhaka 1207");
        contentValues.put("contact","029132548");
        db.insert("ortho",null,contentValues);
        contentValues.clear();
    }

    public void uroData(SQLiteDatabase db){
        ContentValues contentValues = new ContentValues();

        contentValues.put("name","Dr. Md. Shafiqul Alam Chowdhury");
        contentValues.put("degree","MBBS, MS (Urology)");
        contentValues.put("hospital","Dhaka Medical College & Hospital");
        contentValues.put("chamber","City Hospital Ltd\n" +
                "1/8, Block# E, Lalmatia, Mohammadpur, Dhaka 1207");
        contentValues.put("contact","028143437");
        db.insert("uro",null,contentValues);
        contentValues.clear();

        contentValues.put("name","Prof. Dr. M.A. Salam");
        contentValues.put("degree","MBBS, FCPS, FICS");
        contentValues.put("hospital","Bangabandhu Sheikh Mujib Medical University");
        contentValues.put("chamber","Comfort Diagnostic Centre\n" +
                "167/B, Green Road, Dhaka 1205");
        contentValues.put("contact","028129667");
        db.insert("uro",null,contentValues);
        contentValues.clear();

        contentValues.put("name","Prof. Dr. Mirza M H Faisal");
        contentValues.put("degree","MBBS, FCPS, FRCS (Ed), FICS");
        contentValues.put("hospital","BIRDEM Hospital & Ibrahim Medical College");
        contentValues.put("chamber","Popular Diagnostic Centre Ltd\n" +
                "House# 16, Road# 2, Dhanmondi R/A, Dhaka 1205");
        contentValues.put("contact","029661491");
        db.insert("uro",null,contentValues);
        contentValues.clear();

        contentValues.put("name","Prof. Dr. Ko Ninan Chac");
        contentValues.put("degree","MBBS, MS, MCh(Urology), FRCS (Urology)");
        contentValues.put("hospital","SQUARE Hospitals Ltd");
        contentValues.put("chamber","SQUARE Hospitals Ltd\n" +
                "18/F West Panthapath, Dhaka 1205");
        contentValues.put("contact","028142431");
        db.insert("uro",null,contentValues);
        contentValues.clear();

        contentValues.put("name","Prof. Dr. S M Mahbub Alam");
        contentValues.put("degree","MBBS, FCPS (Surgery), MS (Urology)");
        contentValues.put("hospital","Dhaka Medical College & Hospital");
        contentValues.put("chamber","Anwer Khan Modern Hospital Ltd\n" +
                "House# 17, Road# 8, Dhanmondi, Dhaka 1205");
        contentValues.put("contact","028616074");
        db.insert("uro",null,contentValues);
        contentValues.clear();

        contentValues.put("name","Prof. Dr. Zamanul Islam Bhuiyan");
        contentValues.put("degree","FCPS, FICS, MS");
        contentValues.put("hospital","National Institute of Kidney Diseases & Urology");
        contentValues.put("chamber","Green Life Hospital Ltd\n" +
                "32, Green Road, Dhaka 1205");
        contentValues.put("contact","028628820");
        db.insert("uro",null,contentValues);
        contentValues.clear();
    }

    public void dentistsData(SQLiteDatabase db){
        ContentValues contentValues = new ContentValues();

        contentValues.put("name","Prof. Dr. Md. Shamsul Alam");
        contentValues.put("degree","BDS, DCD(USSR), FADI(USA)");
        contentValues.put("hospital","BSM Medical University");
        contentValues.put("chamber","Green Life Hospital Limited\n" +
                "32 Green Road, Dhaka 1205");
        contentValues.put("contact","029615412");
        db.insert("dentists",null,contentValues);
        contentValues.clear();

        contentValues.put("name","Prof. Dr. Khandaker Abdul Azim");
        contentValues.put("degree","BDS, Dip, OMS (Australia)");
        contentValues.put("hospital","Ibn Sina Dental Center");
        contentValues.put("chamber","Ibn Sina Dental Center\n" +
                "House# 47, Road# 9/A, Dhanmondi, Dhaka 1209");
        contentValues.put("contact","029128835");
        db.insert("dentists",null,contentValues);
        contentValues.clear();

        contentValues.put("name","Dr. Mohammed Shafi Ullah");
        contentValues.put("degree","MBBS, MS, BDS, MCPS, MDRA(USA)");
        contentValues.put("hospital","Sapora Dental College & Hospital");
        contentValues.put("chamber","Islami Bank Central Hospital\n" +
                "30, Anjuman Mafidul Islam Road, Kakrail, Dhaka 1000");
        contentValues.put("contact","029360331");
        db.insert("dentists",null,contentValues);
        contentValues.clear();

        contentValues.put("name","Dr. Syed T. Ahsan Ratan");
        contentValues.put("degree","BDS, FPFA (USA), PGT (Japan)");
        contentValues.put("hospital","Ratan's Dental");
        contentValues.put("chamber","Ratan's Dental\n" +
                "150, Green Road, Dhaka 1205");
        contentValues.put("contact","01711823382");
        db.insert("dentists",null,contentValues);
        contentValues.clear();

        contentValues.put("name","Qazi Tanzin Ahmed");
        contentValues.put("degree","BDS (DDC), MPH(BSMMU), FICD(USA)");
        contentValues.put("hospital","City Dental College");
        contentValues.put("chamber","Promi Dent\n" +
                "House# 57, Block# E, Road# 13, Banani, Dhaka");
        contentValues.put("contact","01711030474");
        db.insert("dentists",null,contentValues);
        contentValues.clear();
    }

    public void entData(SQLiteDatabase db){
        ContentValues contentValues = new ContentValues();

        contentValues.put("name","Dr. Arun Dodhu Patole");
        contentValues.put("degree","MBBS, MS, DORL (Mumbai), Fellow A.I.N.OT (Italy)");
        contentValues.put("hospital","Apollo Hospital");
        contentValues.put("chamber","Apollo Hospital\n" +
                "Plot# 81, Block# E, Basudhara R/A, Dhaka 1229");
        contentValues.put("contact","028845242");
        db.insert("ent",null,contentValues);
        contentValues.clear();

        contentValues.put("name","Prof. Dr. A.F. Mohiuddin Khan");
        contentValues.put("degree","MBBS, DLO, MS (ENT)");
        contentValues.put("hospital","Dhaka Medical College & Hospital");
        contentValues.put("chamber","Japan Bangladesh Friendship Hospital\n" +
                "55, Zigatola Bus Stand, Dhaka 1209");
        contentValues.put("contact","029676161");
        db.insert("ent",null,contentValues);
        contentValues.clear();

        contentValues.put("name","Prof. Dr. Abdullah A. Harron");
        contentValues.put("degree","FRCS (Gasgow), FCPS");
        contentValues.put("hospital","United Hospital Limited");
        contentValues.put("chamber","United Hospital Limited\n" +
                "Plot# 15, Road# 71, Gulshan, Dhaka 1212");
        contentValues.put("contact","028836444");
        db.insert("ent",null,contentValues);
        contentValues.clear();

        contentValues.put("name","Prof. Dr. Abul Hasnat Joarder");
        contentValues.put("degree","MBBS, FCPS");
        contentValues.put("hospital","Bangabandhu Sheikh Mujib Medical University");
        contentValues.put("chamber","Anwer Khan Modern Hospital Ltd\n" +
                "House# 17, Road# 8, Dhanmondi, Dhaka 1205");
        contentValues.put("contact","028613883");
        db.insert("ent",null,contentValues);
        contentValues.clear();

        contentValues.put("name","Dr. A. F. Mohiuddin Khan");
        contentValues.put("degree","MBBS, DLO(DU), MS (ENT)");
        contentValues.put("hospital","Dhaka Medical College & Hospital");
        contentValues.put("chamber","City Hospital Ltd\n" +
                "1/8, Block# E, Lalmatia, Mohammadpur, Dhaka 1207");
        contentValues.put("contact","028143437");
        db.insert("ent",null,contentValues);
        contentValues.clear();

        contentValues.put("name","Dr. A.B.M. Khorshed Alam");
        contentValues.put("degree","MBBS, FCPS");
        contentValues.put("hospital","Dhaka Medical College Hospital");
        contentValues.put("chamber","Monowara Hospital (pvt) Ltd\n" +
                "54, Siddeshwari Road, Dhaka 1217");
        contentValues.put("contact","028319802");
        db.insert("ent",null,contentValues);
        contentValues.clear();
    }

    public void speechData(SQLiteDatabase db){
        ContentValues contentValues = new ContentValues();

        contentValues.put("name","Dr A");
        contentValues.put("degree","MBBS DMC, FCPS London");
        contentValues.put("hospital","BSMMU");
        contentValues.put("chamber","BSMMU");
        contentValues.put("contact","01712123000");
        db.insert("speech",null,contentValues);
        contentValues.clear();
    }

    public void visionData(SQLiteDatabase db){
        ContentValues contentValues = new ContentValues();

        contentValues.put("name","Prof. Dr. A.H.M. Enayet Hussain");
        contentValues.put("degree","MBBS, FRCS (Glasg. Uk), FCPS (BD), ICO (UK)");
        contentValues.put("hospital","Ahmed Medical Center");
        contentValues.put("chamber","Ahmed Medical Center\n" +
                "House# 71, Road# 15/A, Dhaka 1209");
        contentValues.put("contact","028118628");
        db.insert("vision",null,contentValues);
        contentValues.clear();

        contentValues.put("name","Prof. Dr. Shah Alam");
        contentValues.put("degree","MBBS, FCPS (Ophthalmology)");
        contentValues.put("hospital","SQUARE Hospitals Ltd");
        contentValues.put("chamber","SQUARE Hospitals Ltd.\n" +
                "18/F, Panthapath, Dhaka 1205");
        contentValues.put("contact","028142431");
        db.insert("vision",null,contentValues);
        contentValues.clear();

        contentValues.put("name","Dr. G M Mostafa");
        contentValues.put("degree","MBBS, DO, MS (Eye)");
        contentValues.put("hospital","National Eye Science Institute & Hospital");
        contentValues.put("chamber","Labaid Specialized Hospital\n" +
                "House# 6, Road# 4, Dhanmondi, Dhaka 1205");
        contentValues.put("contact","028610793");
        db.insert("vision",null,contentValues);
        contentValues.clear();

        contentValues.put("name","Dr. Manash Kumar Goswami");
        contentValues.put("degree","D.O (Dhaka), M.S (Ophth)");
        contentValues.put("hospital","BIRDEM");
        contentValues.put("chamber","Central Hospital \n" +
                "House# 2, Road# 5, Green Road, Dhaka");
        contentValues.put("contact","028624514");
        db.insert("vision",null,contentValues);
        contentValues.clear();

        contentValues.put("name","Dr. Jasim Uddin");
        contentValues.put("degree","MBBS, DO, FICO (UK), PhD (London)");
        contentValues.put("hospital","Islami Bank Central Hospital");
        contentValues.put("chamber","Islami Bank Central Hospital\n" +
                "30, Anjuman-e-Mofidul Islam Road, Kakrail, Dhaka 1000");
        contentValues.put("contact","029360331");
        db.insert("vision",null,contentValues);
        contentValues.clear();

        contentValues.put("name","Dr. Sarwar Alam");
        contentValues.put("degree","MBBS, DO, FCPS");
        contentValues.put("hospital","Islamia Eye Hospital");
        contentValues.put("chamber","Anwer Khan Modern Hospital Ltd\n" +
                "House# 17, Road# 8, Dhanmondi, Dhaka 1205");
        contentValues.put("contact","029670295");
        db.insert("vision",null,contentValues);
        contentValues.clear();

        contentValues.put("name","Prof. M. Nazrul Islam");
        contentValues.put("degree","MBBS, D.O., MCPS, FCPS");
        contentValues.put("hospital","Bangladesh Eye Hospital");
        contentValues.put("chamber","Bangladesh Eye Hospital\n" +
                "78, Satmashjid Road, Dhaka 1205");
        contentValues.put("contact","029102264");
        db.insert("vision",null,contentValues);
        contentValues.clear();
    }

    public void pediData(SQLiteDatabase db){
        ContentValues contentValues = new ContentValues();

        contentValues.put("name","Prof. Dr. Md. Mizanur Rahman");
        contentValues.put("degree","MBBS, FCPS");
        contentValues.put("hospital","Bangabandhu Sheikh Mujib Medical University");
        contentValues.put("chamber","Central Hospital Limited\n" +
                "House# 5, Road# 2, Green Road, Dhaka 1205");
        contentValues.put("contact","029660015");
        db.insert("pedi",null,contentValues);
        contentValues.clear();

        contentValues.put("name","Dr. Narayan Saha");
        contentValues.put("degree","MBBS, FCPS");
        contentValues.put("hospital","Dhaka Medical College & Hospital");
        contentValues.put("chamber","Comfort Diagnostic Centre\n" +
                "167/B, Green Road, Dhaka 1205");
        contentValues.put("contact","028124990");
        db.insert("pedi",null,contentValues);
        contentValues.clear();

        contentValues.put("name","Dr. Shahin Akter");
        contentValues.put("degree","MBBS, MD");
        contentValues.put("hospital","Bangabandhu Sheikh Mujib Medical University");
        contentValues.put("chamber","Central Hospital Limited\n" +
                "House# 2, Road# 5, Green Road, Dhaka 1205");
        contentValues.put("contact","029660015");
        db.insert("pedi",null,contentValues);
        contentValues.clear();
    }

    public void dietData(SQLiteDatabase db){
        ContentValues contentValues = new ContentValues();

        contentValues.put("name","Tamanna Chowdhury");
        contentValues.put("degree","Principal Dietician");
        contentValues.put("hospital","Apollo Hospital");
        contentValues.put("chamber","Apollo Hospital\n" +
                "Plot# 81, Block# E, Bashundhara R/A, Dhaka 1229");
        contentValues.put("contact","09606-276555");
        db.insert("diet",null,contentValues);
        contentValues.clear();

        contentValues.put("name","Sumaiya Shahnaz ");
        contentValues.put("degree","Nutritionist ");
        contentValues.put("hospital","Ibn Sina Hospital");
        contentValues.put("chamber","Ibn Sina Hospital\n" +
                "House#64, Road# 15/A, Dhanmondi, Dhaka 1209");
        contentValues.put("contact","028118526");
        db.insert("diet",null,contentValues);
        contentValues.clear();

        contentValues.put("name","Dr Dilara Makhbul");
        contentValues.put("degree","MBBS");
        contentValues.put("hospital","Labaid Specilized Hospital");
        contentValues.put("chamber","Labaid Specilized Hospital\n" +
                "House# 06, Road# 04, Dhanmondi, Dhaka 1205");
        contentValues.put("contact","10606");
        db.insert("diet",null,contentValues);
        contentValues.clear();

        contentValues.put("name","Dr. Kamrun Naher");
        contentValues.put("degree","MBBS");
        contentValues.put("hospital","Labaid Specilized Hospital");
        contentValues.put("chamber","Labaid Specilized Hospital\n" +
                "House# 06, Road# 04, Dhanmondi, Dhaka 1205");
        contentValues.put("contact","10606");
        db.insert("diet",null,contentValues);
        contentValues.clear();

        contentValues.put("name","Dr. Salma Pervin");
        contentValues.put("degree","MBBS");
        contentValues.put("hospital","Labaid Specilized Hospital");
        contentValues.put("chamber","Labaid Specilized Hospital\n" +
                "House# 06, Road# 04, Dhanmondi, Dhaka 1205");
        contentValues.put("contact","10606");
        db.insert("diet",null,contentValues);
        contentValues.clear();

        contentValues.put("name","S.N. Shampa");
        contentValues.put("degree","MSC (DU), BSC(Hons, Nutrition), MSC (Nutrition), PGCC, NIN, ICMR (India)");
        contentValues.put("hospital","Samorita Hospital");
        contentValues.put("chamber","Samorita Hospital\n" +
                "89/1, Panthapath, Dhaka 1215");
        contentValues.put("contact","029131901");
        db.insert("diet",null,contentValues);
        contentValues.clear();
    }

    public void hospitalData(SQLiteDatabase db){
        ContentValues contentValues = new ContentValues();

        contentValues.put("name","Bangladesh Specialized Hospital");
        contentValues.put("address","21, Mirpur Road, Shyamoli,DHaka 1207");
        contentValues.put("loc","Shyamoli");
        contentValues.put("contact","09666-700100");
        db.insert("hospital",null,contentValues);
        contentValues.clear();

        contentValues.put("name","Apollo Hospitals Limited");
        contentValues.put("address","Plot: 81, Block: E, Bashundhara R/A, Dhaka 1229");
        contentValues.put("loc","Bashundhara");
        contentValues.put("contact","02-55037242");
        db.insert("hospital",null,contentValues);
        contentValues.clear();

        contentValues.put("name","Bangladesh ENT Hospital");
        contentValues.put("address","4/1/A Sobahanbag, Mirpur Road, Dhaka 1205.");
        contentValues.put("loc","Sobahanbag");
        contentValues.put("contact","09666-710710");
        db.insert("hospital",null,contentValues);
        contentValues.clear();

        contentValues.put("name","Square Hospital");
        contentValues.put("address","18/F Bir Uttam Qazi Nuruzzaman Sarak West, Panthapath, Dhaka 1205");
        contentValues.put("loc","Panthapath");
        contentValues.put("contact","02-8144400");
        db.insert("hospital",null,contentValues);
        contentValues.clear();

        contentValues.put("name","City Hospital & Diagnostic Center");
        contentValues.put("address","H# 1, 8/Satmashjid Road. Dhaka 1207");
        contentValues.put("loc","Satmashjid Road");
        contentValues.put("contact","02-8143312");
        db.insert("hospital",null,contentValues);
        contentValues.clear();

        contentValues.put("name","Holy Family Red Cresent Medical College");
        contentValues.put("address","1 Eskaton Garden Road, Dhaka 1000");
        contentValues.put("loc","Eskaton Garden Road");
        contentValues.put("contact","02-48311721");
        db.insert("hospital",null,contentValues);
        contentValues.clear();

        contentValues.put("name","Dhaka Central International Medical College");
        contentValues.put("address","2, 1 Ring Road, Dhaka 1207");
        contentValues.put("loc","Ring Road");
        contentValues.put("contact","02-9128727");
        db.insert("hospital",null,contentValues);
        contentValues.clear();

        contentValues.put("name","United Hospital Limited");
        contentValues.put("address","P# 15, R# 71, Gulshan, Dhaka 1212");
        contentValues.put("loc","Gulshan");
        contentValues.put("contact","02-9852466");
        db.insert("hospital",null,contentValues);
        contentValues.clear();

        contentValues.put("name","Central Hospital");
        contentValues.put("address","H# 2, R# 5, Green Road, Dhaka 1205");
        contentValues.put("loc","Green Road");
        contentValues.put("contact","02-9660015");
        db.insert("hospital",null,contentValues);
        contentValues.clear();

        contentValues.put("name","Al Manar Hospital Ltd.");
        contentValues.put("address","P# Umo, B# Rosshoi, Satmashjid Road, Dhaka 1207");
        contentValues.put("loc","Satmashjid Road");
        contentValues.put("contact","02-9121588");
        db.insert("hospital",null,contentValues);
        contentValues.clear();

        contentValues.put("name","BRB Hospitals Ltd");
        contentValues.put("address","77/A East Rajabazar, Panthapath, Dhaka 1215");
        contentValues.put("loc","Panthapath");
        contentValues.put("contact","02-9410333");
        db.insert("hospital",null,contentValues);
        contentValues.clear();

        contentValues.put("name","Care Medical College & Hospital Ltd.");
        contentValues.put("address","1/5 B# B, Mohammadpur housing Estate, Collage Gate, Mirpur Road, Dhaka 1207");
        contentValues.put("loc","Mirpur Road");
        contentValues.put("contact","02-9144459");
        db.insert("hospital",null,contentValues);
        contentValues.clear();

        contentValues.put("name","Khidmah Hospital Private Ltd.");
        contentValues.put("address","C- 287/2-3, Khilgaon Bishwa Road, Dhaka 1219");
        contentValues.put("loc","Khilgaon");
        contentValues.put("contact","09606-063030");
        db.insert("hospital",null,contentValues);
        contentValues.clear();

        contentValues.put("name","Lab Aid Hospital");
        contentValues.put("address","H# 1, R#4, Dhanmondi, Mirpur Road, Dhaka 1205");
        contentValues.put("loc","Dhanmondi");
        contentValues.put("contact","02-9676356");
        db.insert("hospital",null,contentValues);
        contentValues.clear();

        contentValues.put("name","Green Life Medical College & Hospital");
        contentValues.put("address","31,32 Bir Uttam, KM Shafiullah Sarak. Green Road, Dhaka 1205");
        contentValues.put("loc","Green Road");
        contentValues.put("contact","02-9612345");
        db.insert("hospital",null,contentValues);
        contentValues.clear();

        contentValues.put("name","Japan Bangladesh Friendship Hospital");
        contentValues.put("address","55 Satmashjid Road, Zigatola Bus Stand, Dhaka 1209");
        contentValues.put("loc","Zigatola");
        contentValues.put("contact","02-9672277");
        db.insert("hospital",null,contentValues);
        contentValues.clear();

        contentValues.put("name","Ibn Sina Hospital ");
        contentValues.put("address","H# 68, R# 15/A, Dhanmondi R/A, Dhaka 1209");
        contentValues.put("loc","Dhanmondi");
        contentValues.put("contact","01823-039800");
        db.insert("hospital",null,contentValues);
        contentValues.clear();

        contentValues.put("name","Birdem General Hospital");
        contentValues.put("address","122 Qazi Nazrul Islam Ave, Shahbagh, Dhaka 1000");
        contentValues.put("loc","Shahbagh");
        contentValues.put("contact","02-9661551");
        db.insert("hospital",null,contentValues);
        contentValues.clear();

        contentValues.put("name","Anwer Khan Modern Medical College Hospital");
        contentValues.put("address","H# 17, R#8, Dhanmondi R/A, Dhaka 1205");
        contentValues.put("loc","Dhanmondi");
        contentValues.put("contact","02-9670295");
        db.insert("hospital",null,contentValues);
        contentValues.clear();

        contentValues.put("name","Banani Clinic Ltd.");
        contentValues.put("address","H# 116, R# 15, B# C, Banani, Dhaka 1213");
        contentValues.put("loc","Banani");
        contentValues.put("contact","02-9820520");
        db.insert("hospital",null,contentValues);
        contentValues.clear();
    }

    public void schoolData(SQLiteDatabase db){
        ContentValues contentValues = new ContentValues();

        contentValues.put("name","Autism Welfare Foundation");
        contentValues.put("address","Shamlapur, Moddher Char, 1310");
        contentValues.put("loc","Shamlapur");
        contentValues.put("contact","01552-363575");
        db.insert("school",null,contentValues);
        contentValues.clear();

        contentValues.put("name","Society for the Welfare of Autistic Children (SWAC)");
        contentValues.put("address","70/KA, PC Culture, Shyamoli, Dhaka 1207");
        contentValues.put("loc","Shyamoli");
        contentValues.put("contact","02-58150565");
        db.insert("school",null,contentValues);
        contentValues.clear();

        contentValues.put("name","Autistic Children's Welfare Foundation");
        contentValues.put("address","House# 74, Lane# 3, Block# E, Kalshi, Mirpur 12, Dhaka 1216");
        contentValues.put("loc","Mirpur");
        contentValues.put("contact","02-8019238");
        db.insert("school",null,contentValues);
        contentValues.clear();

        contentValues.put("name","School for Gifted Children (SGC)");
        contentValues.put("address","6, 9 Block# E, Lalmatia, Dhaka 1207");
        contentValues.put("loc","Lalmatia");
        contentValues.put("contact","02-9142139");
        db.insert("school",null,contentValues);
        contentValues.clear();

        contentValues.put("name","Beutiful Mind School");
        contentValues.put("address","Plot# 1145, Road# 6/A, Dolipara, Sector#5, Uttara, Dhaka 1230");
        contentValues.put("loc","Uttara");
        contentValues.put("contact","");
        db.insert("school",null,contentValues);
        contentValues.clear();

        contentValues.put("name","Smiling Children Special School");
        contentValues.put("address","House# 40, Road# 6, Block# E, Sector# 1, Uttara, Dhaka 1230");
        contentValues.put("loc","Uttara");
        contentValues.put("contact","01741-213893");
        db.insert("school",null,contentValues);
        contentValues.clear();

        contentValues.put("name","Autism BD");
        contentValues.put("address","52/1 hasan Holdings, New Eskaton Road, Dhaka 1000");
        contentValues.put("loc","New Eskaton Road");
        contentValues.put("contact","01931-405986");
        db.insert("school",null,contentValues);
        contentValues.clear();

        contentValues.put("name","Bangladesh ABA Center for Autism");
        contentValues.put("address","House# 76, Road# 17, Sector# 11, Uttara, Dhaka 1230");
        contentValues.put("loc","Uttara");
        contentValues.put("contact","01760-207677");
        db.insert("school",null,contentValues);
        contentValues.clear();

        contentValues.put("name","Rainbow Autism Care Foundation");
        contentValues.put("address","GA 3/1C, Eidgah Mashjid Road, SHahjadpur, Gulshan, Dhaka 1212");
        contentValues.put("loc","Gulshan");
        contentValues.put("contact","01711203681");
        db.insert("school",null,contentValues);
        contentValues.clear();

        contentValues.put("name","Special Care Foundation");
        contentValues.put("address","House# 6, Road# 11, Sector# 7, Uttara, Dhaka 1230");
        contentValues.put("loc","Uttara");
        contentValues.put("contact","01771-785795");
        db.insert("school",null,contentValues);
        contentValues.clear();
    }
}
