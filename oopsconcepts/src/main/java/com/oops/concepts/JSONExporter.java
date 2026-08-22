package com.oops.concepts;

import java.util.List;

public class JSONExporter extends DataExporter {

    @Override
    public void export(List<String> data) {
        if(!validate(data)) return;
        StringBuilder sb = new StringBuilder();
        System.out.print("JSON : [");
        for(int i=0;i<data.size();i++) {
            sb.append("\"" + data.get(i) + "\"");
            if(i != data.size() - 1) {
                sb.append(",");
            }
        }
        sb.append("]");
        System.out.println(sb.toString());
    }
}
