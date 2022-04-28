package org.cyclonedx.gradle;

import org.cyclonedx.CycloneDxSchema;
import org.cyclonedx.model.Component;

import java.util.ArrayList;
import java.util.List;

public class CycloneDxConfig {
    public CycloneDxSchema.Version schemaVersion = CycloneDxSchema.Version.VERSION_13;
    public BomOutputType bomOutputType = BomOutputType.XML;
    public List<String> includeConfigs = new ArrayList<>();
    public List<String> skipConfigs = new ArrayList<>();
    public boolean includeBomSerialNumber = true;
    public boolean skip = false;
    public Component.Type projectType = Component.Type.LIBRARY;

    public CycloneDxConfig() {
    }
}
