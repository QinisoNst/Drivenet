package com.drivenet.rsa.database.database;

import android.content.Context;
import android.os.AsyncTask;
import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

import com.drivenet.rsa.database.DaoClass.VisionDaoInsert;
import com.drivenet.rsa.database.DaoClass.VisionDaoSelect;
import com.drivenet.rsa.database.DaoClass.VisionDaoUpdate;
import com.drivenet.rsa.database.Student.Applying;
import com.drivenet.rsa.database.Student.Student;
import com.drivenet.rsa.database.Student.courseholder;
import com.drivenet.rsa.database.Student.coursepicker;
import com.drivenet.rsa.database.uni.ec.Ufh;
import com.drivenet.rsa.database.uni.ec.Wsu;
import com.drivenet.rsa.database.uni.ec.nmu.nmu;
import com.drivenet.rsa.database.uni.ec.ru.ru;
import com.drivenet.rsa.database.uni.fs.Cut;
import com.drivenet.rsa.database.uni.fs.Ufs;
import com.drivenet.rsa.database.uni.g.Tut;
import com.drivenet.rsa.database.uni.g.Uj;
import com.drivenet.rsa.database.uni.g.smu.smu;
import com.drivenet.rsa.database.uni.g.up;
import com.drivenet.rsa.database.uni.g.uwj.uwj;
import com.drivenet.rsa.database.uni.g.vut;
import com.drivenet.rsa.database.uni.k.Ukzn;
import com.drivenet.rsa.database.uni.k.dut;
import com.drivenet.rsa.database.uni.k.mut;
import com.drivenet.rsa.database.uni.k.unizulu;
import com.drivenet.rsa.database.uni.l.ul;
import com.drivenet.rsa.database.uni.l.univen;
import com.drivenet.rsa.database.uni.m.ump;
import com.drivenet.rsa.database.uni.nc.spu.spu;
import com.drivenet.rsa.database.uni.nw.nwu;
import com.drivenet.rsa.database.uni.other.unisa;
import com.drivenet.rsa.database.uni.wc.cput;
import com.drivenet.rsa.database.uni.wc.su;
import com.drivenet.rsa.database.uni.wc.uct;
import com.drivenet.rsa.database.uni.wc.uwc.uwc;

@Database(entities =
        {
                Student.class, nmu.class, ru.class, Ufh.class, Wsu.class,
                Cut.class, Ufs.class, smu.class, Tut.class, Uj.class,
                up.class, uwj.class, vut.class, dut.class, Ukzn.class,
                mut.class, unizulu.class, ul.class, univen.class, ump.class,
                spu.class, nwu.class, unisa.class, cput.class, su.class,
                uct.class, uwc.class, Applying.class, coursepicker.class, courseholder.class
        }, version = 3)
public abstract class VisionDatabase extends RoomDatabase {

    public abstract VisionDaoInsert getDao();
    public abstract VisionDaoUpdate getUpdate();
    public abstract VisionDaoSelect getSelect();
    private static VisionDatabase instance;


    public  static VisionDatabase getDatabase(final Context context) {
        if (instance == null)
        {
            synchronized (VisionDatabase.class) {
                instance = Room.databaseBuilder(context, VisionDatabase.class, "vision.db")
                        .allowMainThreadQueries()
                        .fallbackToDestructiveMigration()
                        .addCallback(roomCallback)
                        .build();
            }
        }
        return instance;
    }
    private static Callback roomCallback = new Callback() {
        @Override
        public void onCreate(@NonNull SupportSQLiteDatabase db) {
            super.onCreate(db);
            new PopulateDbAsyncTask(instance).execute();
        }
    };
    private static class PopulateDbAsyncTask extends AsyncTask<Void, Void, Void>
    {
        private VisionDaoInsert visionDaoInsert;

        private PopulateDbAsyncTask(VisionDatabase db) {
            visionDaoInsert = db.getDao();
        }
        @Override
        protected Void doInBackground(Void... voids)
        {
            coursesa(visionDaoInsert);
            return null;
        }
        private void coursesa(VisionDaoInsert visionDaoInsert)
        {

            course courses = new course(visionDaoInsert);

            courses.wits(visionDaoInsert);
            courses.spu(visionDaoInsert);
            courses.uwc(visionDaoInsert);
            courses.smu(visionDaoInsert);
            courses.ump(visionDaoInsert);

            courses.students(visionDaoInsert);

            courses.appling(visionDaoInsert);

            courses.courseholder(visionDaoInsert);
            courses.coursepicker(visionDaoInsert);

        }
    }
}

