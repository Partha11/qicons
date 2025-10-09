package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.CalendarDays: ImageVector
    get() {
        if (_CalendarDays != null) {
            return _CalendarDays!!
        }
        _CalendarDays = ImageVector.Builder(
            name = "Outlined.CalendarDays",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.75f, 3f)
                verticalLineToRelative(2.25f)
                moveTo(17.25f, 3f)
                verticalLineToRelative(2.25f)
                moveTo(3f, 18.75f)
                lineTo(3f, 7.5f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.25f, -2.25f)
                horizontalLineToRelative(13.5f)
                arcTo(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 7.5f)
                verticalLineToRelative(11.25f)
                moveToRelative(-18f, 0f)
                arcTo(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.25f, 21f)
                horizontalLineToRelative(13.5f)
                arcTo(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 18.75f)
                moveToRelative(-18f, 0f)
                verticalLineToRelative(-7.5f)
                arcTo(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.25f, 9f)
                horizontalLineToRelative(13.5f)
                arcTo(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 11.25f)
                verticalLineToRelative(7.5f)
                moveToRelative(-9f, -6f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.008f)
                lineTo(12f, 12.758f)
                verticalLineToRelative(-0.008f)
                close()
                moveTo(12f, 15f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.008f)
                lineTo(12f, 15.008f)
                lineTo(12f, 15f)
                close()
                moveTo(12f, 17.25f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.008f)
                lineTo(12f, 17.258f)
                verticalLineToRelative(-0.008f)
                close()
                moveTo(9.75f, 15f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.008f)
                lineTo(9.75f, 15.008f)
                lineTo(9.75f, 15f)
                close()
                moveTo(9.75f, 17.25f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.008f)
                lineTo(9.75f, 17.258f)
                verticalLineToRelative(-0.008f)
                close()
                moveTo(7.5f, 15f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.008f)
                lineTo(7.5f, 15.008f)
                lineTo(7.5f, 15f)
                close()
                moveTo(7.5f, 17.25f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.008f)
                lineTo(7.5f, 17.258f)
                verticalLineToRelative(-0.008f)
                close()
                moveTo(14.25f, 12.75f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.008f)
                horizontalLineToRelative(-0.008f)
                verticalLineToRelative(-0.008f)
                close()
                moveTo(14.25f, 15f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.008f)
                horizontalLineToRelative(-0.008f)
                lineTo(14.25f, 15f)
                close()
                moveTo(14.25f, 17.25f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.008f)
                horizontalLineToRelative(-0.008f)
                verticalLineToRelative(-0.008f)
                close()
                moveTo(16.5f, 12.75f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.008f)
                lineTo(16.5f, 12.758f)
                verticalLineToRelative(-0.008f)
                close()
                moveTo(16.5f, 15f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.008f)
                lineTo(16.5f, 15.008f)
                lineTo(16.5f, 15f)
                close()
            }
        }.build()

        return _CalendarDays!!
    }

@Suppress("ObjectPropertyName")
private var _CalendarDays: ImageVector? = null
