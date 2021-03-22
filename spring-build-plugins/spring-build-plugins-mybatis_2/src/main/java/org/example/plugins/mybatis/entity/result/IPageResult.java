package org.example.plugins.mybatis.entity.result;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.github.pagehelper.PageInfo;
import lombok.EqualsAndHashCode;
import lombok.Value;
import org.example.plugins.mybatis.entity.IPageData;

/**
 * @author yuane
 */
@SuppressWarnings("unused")
@EqualsAndHashCode(callSuper = true)
@Value
public class IPageResult<T> extends IPageData<T> {
    public IPageResult(IPage<T> iPage) {
        super(iPage.getRecords(),iPage.getCurrent(),iPage.getSize(),iPage.getPages(),iPage.getTotal());
    }

    public IPageResult(PageInfo<T> pageInfo) {
        super(pageInfo.getList(), pageInfo.getPageNum(), pageInfo.getPageSize(), pageInfo.getPages(), pageInfo.getTotal());
    }

}