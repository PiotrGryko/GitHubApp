// Generated by Dagger (https://google.github.io/dagger).
package com.piotr.xapo.fragment.list;

import dagger.MembersInjector;
import javax.inject.Provider;

public final class ListFragment_MembersInjector implements MembersInjector<ListFragment> {
  private final Provider<Contract.Presenter> presenterProvider;

  public ListFragment_MembersInjector(Provider<Contract.Presenter> presenterProvider) {
    this.presenterProvider = presenterProvider;
  }

  public static MembersInjector<ListFragment> create(
      Provider<Contract.Presenter> presenterProvider) {
    return new ListFragment_MembersInjector(presenterProvider);
  }

  @Override
  public void injectMembers(ListFragment instance) {
    injectPresenter(instance, presenterProvider.get());
  }

  public static void injectPresenter(ListFragment instance, Contract.Presenter presenter) {
    instance.presenter = presenter;
  }
}