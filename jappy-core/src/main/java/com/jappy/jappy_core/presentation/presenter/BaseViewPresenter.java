package com.jappy.jappy_core.presentation.presenter;

/**
 * Created by eucaris on 2/27/18.
 */

public interface BaseViewPresenter<T> {
    /**
     * This method will be executed after
     * [AppCompatActivity.onCreate] ()} in case presenter is attached to activity <br></br>
     * [Fragment.onCreateView] ()}  in case presenter is attached to fragment
     */
    void initialize(T view);


}