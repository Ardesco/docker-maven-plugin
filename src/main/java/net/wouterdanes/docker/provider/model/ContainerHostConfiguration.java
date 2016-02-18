package net.wouterdanes.docker.provider.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ContainerHostConfiguration {

    /**
     * A list of volume bindings for the container.  Each volume binding is a string in one of these forms:
     * - container_path to create a new volume for the container
     * - host_path:container_path to bind-mount a host path into the container
     * - host_path:container_path:ro to make the bind-mount read-only inside the container.
     * - volume_name:container_path to bind-mount a volume managed by a volume plugin into the container.
     * - volume_name:container_path:ro to make the bind mount read-only inside the container.
     */
    private List<String> binds = new ArrayList<>();

    /**
     * A list of volumes to inherit from another container. Specified in the form <container name>[:<ro|rw>]
     */
    private List<String> volumesFrom = new ArrayList<>();
    ;

    public List<String> getBinds() {
        return binds;
    }

    public List<String> getVolumesFrom() {
        return volumesFrom;
    }

    public ContainerHostConfiguration setBinds(String... binds) {
        Collections.addAll(this.binds, binds);
        return this;
    }

    public ContainerHostConfiguration setVolumesFrom(String... volumesFrom) {
        Collections.addAll(this.volumesFrom, volumesFrom);
        return this;
    }
}
