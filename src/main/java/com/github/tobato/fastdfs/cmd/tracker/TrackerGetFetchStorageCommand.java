package com.github.tobato.fastdfs.cmd.tracker;

import com.github.tobato.fastdfs.StorageClientInfo;
import com.github.tobato.fastdfs.cmd.AbstractFdfsCommand;
import com.github.tobato.fastdfs.cmd.FdfsResponse;
import com.github.tobato.fastdfs.cmd.tracker.internal.TrackerGetFetchStorageRequest;

/**
 * 获取源服务器
 * 
 * @author wuyf
 *
 */
public class TrackerGetFetchStorageCommand extends AbstractFdfsCommand<StorageClientInfo> {

    public TrackerGetFetchStorageCommand(String groupName, String path, boolean toUpdate) {
        super.request = new TrackerGetFetchStorageRequest(groupName, path, toUpdate);
        super.response = new FdfsResponse<StorageClientInfo>() {
            // default response
        };
    }

}