// Generated by Dagger (https://google.github.io/dagger).
package com.piotr.xapo.fragment.list;

import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class ListModule_ProvideViewFactory implements Factory<Contract.View> {
  private final ListModule module;

  public ListModule_ProvideViewFactory(ListModule module) {
    this.module = module;
  }

  @Override
  public Contract.View get() {
    return provideInstance(module);
  }

  public static Contract.View provideInstance(ListModule module) {
    return proxyProvideView(module);
  }

  public static ListModule_ProvideViewFactory create(ListModule module) {
    return new ListModule_ProvideViewFactory(module);
  }

  public static Contract.View proxyProvideView(ListModule instance) {
    return Preconditions.checkNotNull(
        instance.provideView(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
