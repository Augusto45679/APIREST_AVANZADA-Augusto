package org.example.config;

import com.example.demo.entities.audit.Revision;
import org.hibernate.envers.RevisionListener;


public class CustomRevisionListener implements RevisionListener{
    public void newRevision(Object revisionEntity){ final Revision revision = (Revision) revisionEntity; }
}
