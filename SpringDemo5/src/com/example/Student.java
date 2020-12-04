package com.example;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;


@Data //Data: getter + setter + toString + equals + DefaultConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Student {
	private @NonNull String name;
	private @NonNull int age;
	private @NonNull List<String> hobbys;
	private double height;
	private double weight;
}
