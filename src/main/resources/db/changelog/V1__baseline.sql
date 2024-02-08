create table if not exists expense_category (
    id uuid primary key,
    slug text not null,
    title text not null,
    created_at timestamp not null,
    updated_at timestamp not null
);

create table if not exists expense (
    id uuid primary key,
    cost decimal not null,
    expense_category_id uuid not null references expense_category(id),
    description text not null,
    created_at timestamp not null,
    updated_at timestamp not null
);

create index expense_expense_category_id_idx on expense(expense_category_id);
