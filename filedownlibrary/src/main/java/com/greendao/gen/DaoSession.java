package com.greendao.gen;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.micky.www.filedownlibrary.DownloadInfo;

import com.greendao.gen.DownloadInfoDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig downloadInfoDaoConfig;

    private final DownloadInfoDao downloadInfoDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        downloadInfoDaoConfig = daoConfigMap.get(DownloadInfoDao.class).clone();
        downloadInfoDaoConfig.initIdentityScope(type);

        downloadInfoDao = new DownloadInfoDao(downloadInfoDaoConfig, this);

        registerDao(DownloadInfo.class, downloadInfoDao);
    }
    
    public void clear() {
        downloadInfoDaoConfig.clearIdentityScope();
    }

    public DownloadInfoDao getDownloadInfoDao() {
        return downloadInfoDao;
    }

}
