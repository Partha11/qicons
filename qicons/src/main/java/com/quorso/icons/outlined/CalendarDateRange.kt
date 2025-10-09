package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.CalendarDateRange: ImageVector
    get() {
        if (_CalendarDateRange != null) {
            return _CalendarDateRange!!
        }
        _CalendarDateRange = ImageVector.Builder(
            name = "Outlined.CalendarDateRange",
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
                moveTo(6.75f, 2.994f)
                verticalLineToRelative(2.25f)
                moveToRelative(10.5f, -2.25f)
                verticalLineToRelative(2.25f)
                moveToRelative(-14.252f, 13.5f)
                lineTo(2.998f, 7.491f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.25f, -2.25f)
                horizontalLineToRelative(13.5f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.25f, 2.25f)
                verticalLineToRelative(11.251f)
                moveToRelative(-18f, 0f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.25f, 2.25f)
                horizontalLineToRelative(13.5f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.25f, -2.25f)
                moveToRelative(-18f, 0f)
                verticalLineToRelative(-7.5f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.25f, -2.25f)
                horizontalLineToRelative(13.5f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.25f, 2.25f)
                verticalLineToRelative(7.5f)
                moveToRelative(-6.75f, -6f)
                horizontalLineToRelative(2.25f)
                moveToRelative(-9f, 2.25f)
                horizontalLineToRelative(4.5f)
                moveToRelative(0.002f, -2.25f)
                horizontalLineToRelative(0.005f)
                verticalLineToRelative(0.006f)
                lineTo(12f, 12.748f)
                verticalLineToRelative(-0.006f)
                close()
                moveTo(11.999f, 17.242f)
                horizontalLineToRelative(0.006f)
                verticalLineToRelative(0.006f)
                horizontalLineToRelative(-0.006f)
                verticalLineToRelative(-0.005f)
                close()
                moveTo(9.749f, 17.243f)
                horizontalLineToRelative(0.005f)
                verticalLineToRelative(0.006f)
                lineTo(9.75f, 17.249f)
                verticalLineToRelative(-0.006f)
                close()
                moveTo(7.499f, 17.243f)
                horizontalLineToRelative(0.005f)
                verticalLineToRelative(0.005f)
                horizontalLineToRelative(-0.006f)
                verticalLineToRelative(-0.005f)
                close()
                moveTo(14.249f, 14.996f)
                horizontalLineToRelative(0.005f)
                verticalLineToRelative(0.005f)
                horizontalLineToRelative(-0.005f)
                verticalLineToRelative(-0.005f)
                close()
                moveTo(14.249f, 17.243f)
                horizontalLineToRelative(0.006f)
                verticalLineToRelative(0.006f)
                horizontalLineToRelative(-0.006f)
                verticalLineToRelative(-0.006f)
                close()
                moveTo(16.499f, 14.995f)
                horizontalLineToRelative(0.006f)
                lineTo(16.505f, 15f)
                lineTo(16.5f, 15f)
                verticalLineToRelative(-0.005f)
                close()
            }
        }.build()

        return _CalendarDateRange!!
    }

@Suppress("ObjectPropertyName")
private var _CalendarDateRange: ImageVector? = null
