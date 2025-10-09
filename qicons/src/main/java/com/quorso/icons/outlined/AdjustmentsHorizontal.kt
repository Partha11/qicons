package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.AdjustmentsHorizontal: ImageVector
    get() {
        if (_AdjustmentsHorizontal != null) {
            return _AdjustmentsHorizontal!!
        }
        _AdjustmentsHorizontal = ImageVector.Builder(
            name = "Outlined.AdjustmentsHorizontal",
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
                moveTo(10.5f, 6f)
                horizontalLineToRelative(9.75f)
                moveTo(10.5f, 6f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -3f, 0f)
                moveToRelative(3f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -3f, 0f)
                moveTo(3.75f, 6f)
                horizontalLineTo(7.5f)
                moveToRelative(3f, 12f)
                horizontalLineToRelative(9.75f)
                moveToRelative(-9.75f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 0f)
                moveToRelative(3f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 0f)
                moveToRelative(-3.75f, 0f)
                horizontalLineTo(7.5f)
                moveToRelative(9f, -6f)
                horizontalLineToRelative(3.75f)
                moveToRelative(-3.75f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 0f)
                moveToRelative(3f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 0f)
                moveToRelative(-9.75f, 0f)
                horizontalLineToRelative(9.75f)
            }
        }.build()

        return _AdjustmentsHorizontal!!
    }

@Suppress("ObjectPropertyName")
private var _AdjustmentsHorizontal: ImageVector? = null
