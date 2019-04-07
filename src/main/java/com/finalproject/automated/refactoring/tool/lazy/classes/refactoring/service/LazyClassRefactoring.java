package com.finalproject.automated.refactoring.tool.lazy.classes.refactoring.service;

import com.finalproject.automated.refactoring.tool.model.ClassModel;
import lombok.NonNull;

import java.util.List;

public interface LazyClassRefactoring {
    ClassModel refactor(@NonNull ClassModel targetClass, @NonNull ClassModel lazyClass);

    List<ClassModel> refactor(@NonNull List<ClassModel> targetClasses, @NonNull List<ClassModel> lazyClasses);
}
