package cn.edu.jxnu.awesome_campus.ui.library;

import cn.edu.jxnu.awesome_campus.InitApp;
import cn.edu.jxnu.awesome_campus.R;
import cn.edu.jxnu.awesome_campus.ui.base.BaseListFragment;

/**
 * Created by MummyDing on 16-2-1.
 * GitHub: https://github.com/MummyDing
 * Blog: http://blog.csdn.net/mummyding
 */
public class BookBorrowedFragment extends BaseListFragment{
    @Override
    public String getTitle() {
        return InitApp.AppContext.getString(R.string.book_borrowed);
    }


    @Override
    public void onDataRefresh() {

    }

    @Override
    public void bindAdapter() {

    }

    @Override
    public void addHeader() {

    }

    @Override
    public void initView() {

    }


}
