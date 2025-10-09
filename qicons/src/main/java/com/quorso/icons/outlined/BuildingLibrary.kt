package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.BuildingLibrary: ImageVector
    get() {
        if (_BuildingLibrary != null) {
            return _BuildingLibrary!!
        }
        _BuildingLibrary = ImageVector.Builder(
            name = "Outlined.BuildingLibrary",
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
                moveTo(12f, 21f)
                verticalLineToRelative(-8.25f)
                moveTo(15.75f, 21f)
                verticalLineToRelative(-8.25f)
                moveTo(8.25f, 21f)
                verticalLineToRelative(-8.25f)
                moveTo(3f, 9f)
                lineToRelative(9f, -6f)
                lineToRelative(9f, 6f)
                moveToRelative(-1.5f, 12f)
                verticalLineTo(10.332f)
                arcTo(48.36f, 48.36f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 9.75f)
                curveToRelative(-2.551f, 0f, -5.056f, 0.2f, -7.5f, 0.582f)
                verticalLineTo(21f)
                moveTo(3f, 21f)
                horizontalLineToRelative(18f)
                moveTo(12f, 6.75f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.008f)
                horizontalLineTo(12f)
                verticalLineTo(6.75f)
                close()
            }
        }.build()

        return _BuildingLibrary!!
    }

@Suppress("ObjectPropertyName")
private var _BuildingLibrary: ImageVector? = null
