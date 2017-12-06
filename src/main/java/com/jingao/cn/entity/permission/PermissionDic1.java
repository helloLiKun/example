package com.jingao.cn.entity.permission;

/**
 * Created by liKun on 2017/12/6 0006.
 */
public class PermissionDic1 extends PermissionDic {
    private boolean isHidden;

    private boolean open;

    private boolean click;

    private boolean checked;

    public PermissionDic1() {
    }

    public PermissionDic1(boolean isHidden, boolean open, boolean click, boolean checked) {
        this.isHidden = isHidden;
        this.open = open;
        this.click = click;
        this.checked = checked;
    }

    public boolean isHidden() {
        return isHidden;
    }

    public void setHidden(boolean hidden) {
        isHidden = hidden;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public boolean isClick() {
        return click;
    }

    public void setClick(boolean click) {
        this.click = click;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }
}
