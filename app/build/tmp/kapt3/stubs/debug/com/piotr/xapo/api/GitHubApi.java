package com.piotr.xapo.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/piotr/xapo/api/GitHubApi;", "", "()V", "api", "Lcom/piotr/xapo/api/GitHubApiApi;", "getUsers", "Lio/reactivex/Observable;", "", "Lcom/piotr/xapo/model/User;", "Companion", "app_debug"})
public class GitHubApi {
    private com.piotr.xapo.api.GitHubApiApi api;
    private static com.piotr.xapo.api.GitHubApi instance;
    public static final com.piotr.xapo.api.GitHubApi.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.Observable<java.util.List<com.piotr.xapo.model.User>> getUsers() {
        return null;
    }
    
    public GitHubApi() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/piotr/xapo/api/GitHubApi$Companion;", "", "()V", "instance", "Lcom/piotr/xapo/api/GitHubApi;", "getInstance", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.piotr.xapo.api.GitHubApi getInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}