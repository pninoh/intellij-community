/*
 * Copyright 2000-2009 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.intellij.history.integration.patches;

import com.intellij.openapi.diff.impl.patch.FilePatch;
import com.intellij.openapi.diff.impl.patch.IdeaTextPatchBuilder;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vcs.VcsException;
import com.intellij.openapi.vcs.changes.Change;
import com.intellij.openapi.vcs.changes.CommitContext;
import com.intellij.openapi.vcs.changes.patch.PatchWriter;
import com.intellij.util.ObjectUtils;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;

public class PatchCreator {
  public static void create(Project p, List<? extends Change> changes, String filePath, boolean isReverse, CommitContext commitContext)
    throws IOException, VcsException {
    String basePath = ObjectUtils.assertNotNull(p.getBasePath());
    List<FilePatch> patches = IdeaTextPatchBuilder.buildPatch(p, changes, basePath, isReverse);
    PatchWriter.writePatches(p, filePath, basePath, patches, commitContext, Charset.defaultCharset());
  }
}
