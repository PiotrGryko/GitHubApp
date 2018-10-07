package com.piotr.xapo.fragment.details;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/piotr/xapo/fragment/details/DetailsComponent;", "", "inject", "", "detailsFragment", "Lcom/piotr/xapo/fragment/details/DetailsFragment;", "app_debug"})
@dagger.Component(modules = {com.piotr.xapo.fragment.details.DetailsModule.class}, dependencies = {com.piotr.xapo.di.ApplicationComponent.class})
@com.piotr.xapo.di.FragmentScope()
public abstract interface DetailsComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.piotr.xapo.fragment.details.DetailsFragment detailsFragment);
}