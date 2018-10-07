// Generated by Dagger (https://google.github.io/dagger).
package com.piotr.xapo.di;

import com.piotr.xapo.MyApplication;
import com.piotr.xapo.api.GitHubApi;
import com.piotr.xapo.dao.DaoRepository;
import com.piotr.xapo.dao.MyRoomDatabase;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class DaggerApplicationComponent implements ApplicationComponent {
  private Provider<MyRoomDatabase> provideMyRoomDatabaseProvider;

  private Provider<DaoRepository> getDaoRepositoryProvider;

  private Provider<GitHubApi> getGitHubApiProvider;

  private DaggerApplicationComponent(Builder builder) {
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {
    this.provideMyRoomDatabaseProvider =
        DoubleCheck.provider(
            ApplicationModule_ProvideMyRoomDatabaseFactory.create(builder.applicationModule));
    this.getDaoRepositoryProvider =
        DoubleCheck.provider(
            ApplicationModule_GetDaoRepositoryFactory.create(
                builder.applicationModule, provideMyRoomDatabaseProvider));
    this.getGitHubApiProvider =
        DoubleCheck.provider(
            ApplicationModule_GetGitHubApiFactory.create(builder.applicationModule));
  }

  @Override
  public DaoRepository daoRepository() {
    return getDaoRepositoryProvider.get();
  }

  @Override
  public GitHubApi gitHubApi() {
    return getGitHubApiProvider.get();
  }

  @Override
  public void inject(MyApplication myApplication) {}

  public static final class Builder {
    private ApplicationModule applicationModule;

    private Builder() {}

    public ApplicationComponent build() {
      if (applicationModule == null) {
        throw new IllegalStateException(
            ApplicationModule.class.getCanonicalName() + " must be set");
      }
      return new DaggerApplicationComponent(this);
    }

    public Builder applicationModule(ApplicationModule applicationModule) {
      this.applicationModule = Preconditions.checkNotNull(applicationModule);
      return this;
    }
  }
}
