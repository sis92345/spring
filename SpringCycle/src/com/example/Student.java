package com.example;

import java.util.List;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@RequiredArgsConstructor
@ToString
public class Student {
	private @NonNull String name;
	private @NonNull int age;
	private @NonNull List<String> hobbys;
	private @Setter double height;
	private @Setter double weight;
}
