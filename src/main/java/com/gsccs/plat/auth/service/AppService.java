package com.gsccs.plat.auth.service;

import com.gsccs.plat.auth.model.App;

import java.util.List;

/**
 * <p>User: x.d zhang
 * <p>Date: 14-1-28
 * <p>Version: 1.0
 */
public interface AppService {


    public App createApp(App app);
    public App updateApp(App app);
    public void deleteApp(Long appId);

    public App findOne(Long appId);
    public List<App> findAll();

    /**
     * 根据appKey查找AppId
     * @param appKey
     * @return
     */
    public Long findAppIdByAppKey(String appKey);
}
