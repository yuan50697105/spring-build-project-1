package org.example.spring.plugins.mybatis.entity.result;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.github.pagehelper.PageInfo;
import lombok.EqualsAndHashCode;
import lombok.Value;
import org.example.spring.plugins.commons.entity.IPageData;

import java.util.List;

/**
 * @author yuane
 */
@SuppressWarnings("unused")
@EqualsAndHashCode(callSuper = true)
@Value
public class IPageResult<T> extends IPageData<T> {
    public IPageResult(List<T> data, Integer page, Integer size, Integer totalPage, Integer totalRowNum) {
        super(data, page, size, totalPage, totalRowNum);
    }

    public IPageResult(List<T> data, Integer page, Integer size, Long totalPage, Long totalRowNum) {
        super(data, page, size, totalPage, totalRowNum);
    }

    public IPageResult(List<T> data, Integer page, Integer size, Integer totalPages, Long totalRowNum) {
        super(data, page, size, totalPages, totalRowNum);
    }

    public IPageResult(List<T> data, Long page, Long size, Long totalPage, Long totalRowNum) {
        super(data, page, size, totalPage, totalRowNum);
    }

    public IPageResult(IPage<T> iPage) {
        super(iPage.getRecords(), iPage.getCurrent(), iPage.getSize(), iPage.getPages(), iPage.getTotal());
    }

    public IPageResult(PageInfo<T> pageInfo) {
        super(pageInfo.getList(), pageInfo.getPageNum(), pageInfo.getPageSize(), pageInfo.getPages(), pageInfo.getTotal());
    }

}